import java.util.Arrays;

public class CreateArray {

    //Arrays 1.1.4

    public static String[] createArrayFromText(String st) {
        if (st == null) {
            return new String[0];
        }
        return st.split(" ");
    }

    //Arrays 2.1.1


    public static int[] createIntArrayFromText(String s) { // Дописать валидацию на не цифры
        if (s == null || s.equals("")) {
            return new int[0];
        }

        String[] sArr = s.split(" ");
        int[] result = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            result[i] = (int) Double.parseDouble(sArr[i]);
        }
        return result;
    }

    //Arrays 2.1.5

    public static int[] multiplesOf(int number) {

        if (number < 1 || number > 10) {
            return new int[0];
        }

        int[] resultArr = new int[11];

        for (int i = 0; i < resultArr.length; i++) {

            resultArr[i] = i * number;
        }

        return resultArr;
    }

    //Arrays 3.1  //({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7})-> {“1(800)123-45-67”, “USA”}

    public static String[] getPhoneNumberAndCountry(int[] arr) {

        if (arr == null || arr.length < 11 || arr.length > 17) { // Валидация длинв массива. принимаем номера до 17 знаков
            return new String[]{"Error"};
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 || arr[i] < 0) {
                return new String[]{"Error"}; // валидация цифр
            }
        }
//        //аналогично, но более красиво c for each
//        for (int i : arr
//        ) {
//            if (i > 9 || i < 0) {
//                return new String[]{"Error"}; // валидация цифр
//            }
//        }

        String first5 = "" + arr[0] + arr[1] + arr[2] + arr[3] + arr[4]; // идентификатор страны максимум 5 первых цифр
        String first4 = "" + arr[0] + arr[1] + arr[2] + arr[3];
        String first3 = "" + arr[0] + arr[1] + arr[2];
        String first2 = "" + arr[0] + arr[1];
        String first1 = "" + arr[0]; // минимум одна цифра - например +1 чисто США, +7 РФ

        String resultCountry = "Error"; //Итоговая страна, дефолтное значение

//          ищем совпадения в списке кодов. От макс. кода страны к минимальному(циклом не вышло, т.к. из него не виден метод)
        if (!countryByCode(first5).equals("")) {
            resultCountry = countryByCode(first5);
        } else if (!countryByCode(first4).equals("")) {
            resultCountry = countryByCode(first4);
        } else if (!countryByCode(first3).equals("")) {
            resultCountry = countryByCode(first3);
        } else if (!countryByCode(first2).equals("")) {
            resultCountry = countryByCode(first2);
        } else if (!countryByCode(first1).equals("")) {
            resultCountry = countryByCode(first1);
        }

            // заполняем номер в переменную по маске
            String resultNumber = arr[0] + "(" + arr[1] + arr[2] + arr[3] + ")" + arr[4] + arr[5] + arr[6]
                    + "-" + arr[7] + arr[8] + "-" + arr[9] + arr[10];

//        Более изящный способ заполнения номера по маске - спасибо, Паша
//        resultNumber = "x(xxx)xxx-xx-xx";
//        for (int n : arr) {
//            resultNumber = resultNumber.replaceFirst("x", n + "");

            for (int i = 11; i < arr.length; i++) { // дописываем цифры если номер длиннее 11 символов
                resultNumber += arr[i];
            }

            return new String[]{resultNumber, resultCountry}; //возвращаем итоговый массив строк(номер, страна)
        }

        public static String countryByCode(String s){ //метод ищет строку с кодом и выдаёт строку со страной или пустую

            String[][] codesArr = new String[][]{
                    {"1204", "Canada"},
                    {"1226", "Canada"},
                    {"1236", "Canada"},
                    {"1249", "Canada"},
                    {"1250", "Canada"},
                    {"1289", "Canada"},
                    {"1306", "Canada"},
                    {"1343", "Canada"},
                    {"1365", "Canada"},
                    {"1403", "Canada"},
                    {"1416", "Canada"},
                    {"1418", "Canada"},
                    {"1431", "Canada"},
                    {"1437", "Canada"},
                    {"1438", "Canada"},
                    {"1450", "Canada"},
                    {"1506", "Canada"},
                    {"1514", "Canada"},
                    {"1519", "Canada"},
                    {"1579", "Canada"},
                    {"1581", "Canada"},
                    {"1587", "Canada"},
                    {"1604", "Canada"},
                    {"1613", "Canada"},
                    {"1639", "Canada"},
                    {"1647", "Canada"},
                    {"1705", "Canada"},
                    {"1709", "Canada"},
                    {"1778", "Canada"},
                    {"1780", "Canada"},
                    {"1807", "Canada"},
                    {"1819", "Canada"},
                    {"1867", "Canada"},
                    {"1873", "Canada"},
                    {"1902", "Canada"},
                    {"1905", "Canada"},
                    {"1", "United States of America"},
                    {"1242", "Bahamas"},
                    {"1246", "Barbados"},
                    {"1264", "Anguilla"},
                    {"1268", "Antigua"},
                    {"1268", "Barbuda"},
                    {"1284", "British Virgin Islands"},
                    {"1340", "US Virgin Islands"},
                    {"1345", "Cayman Islands"},
                    {"1441", "Bermuda"},
                    {"1473", "Grenada"},
                    {"1649", "Turks and Caicos Islands"},
                    {"1664", "Montserrat"},
                    {"1670", "Northern Marianas Islands"},
                    {"1671", "Guam"},
                    {"1684", "American Samoa"},
                    {"1758", "St. Lucia"},
                    {"1767", "Dominica"},
                    {"1784", "St. Vincent & Grenadines"},
                    {"1787", "Puerto Rico"},
                    {"1939", "Puerto Rico"},
                    {"1808", "Midway Island"},
                    {"1809", "Dominican Republic"},
                    {"1829", "Dominican Republic"},
                    {"1868", "Trinidad & Tobago"},
                    {"1869", "Nevis"},
                    {"1869", "St. Kitts/Nevis"},
                    {"1876", "Jamaica"},
                    {"20", "Egypt"},
                    {"212", "Morocco"},
                    {"213", "Algeria"},
                    {"216", "Tunisia"},
                    {"218", "Libya"},
                    {"220", "Gambia"},
                    {"221", "Senegal"},
                    {"222", "Mauritania"},
                    {"223", "Mali Republic"},
                    {"224", "Guinea"},
                    {"225", "Côte d'Ivoire (Ivory Coast)"},
                    {"226", "Burkina Faso"},
                    {"227", "Niger"},
                    {"228", "Togolese Republic"},
                    {"229", "Benin"},
                    {"230", "Mauritius"},
                    {"231", "Liberia"},
                    {"232", "Sierra Leone"},
                    {"233", "Ghana"},
                    {"234", "Nigeria"},
                    {"235", "Chad"},
                    {"236", "Central African Republic"},
                    {"237", "Cameroon"},
                    {"238", "Cape Verde Islands"},
                    {"239", "São Tomé and Principe"},
                    {"240", "Equatorial Guinea"},
                    {"241", "Gabonese Republic"},
                    {"242", "Congo"},
                    {"243", "Congo, Dem. Rep. of  (former Zaire)"},
                    {"244", "Angola"},
                    {"245", "Guinea-Bissau"},
                    {"246", "Diego Garcia"},
                    {"247", "Ascension"},
                    {"248", "Seychelles Republic"},
                    {"249", "Sudan"},
                    {"250", "Rwandese Republic"},
                    {"251", "Ethiopia"},
                    {"252", "Somali Democratic Republic"},
                    {"253", "Djibouti"},
                    {"254", "Kenya"},
                    {"255", "Tanzania"},
                    {"255", "Zanzibar"},
                    {"256", "Uganda"},
                    {"257", "Burundi"},
                    {"258", "Mozambique"},
                    {"260", "Zambia"},
                    {"261", "Madagascar"},
                    {"262", "Réunion Island"},
                    {"263", "Zimbabwe"},
                    {"264", "Namibia"},
                    {"265", "Malawi"},
                    {"266", "Lesotho"},
                    {"267", "Botswana"},
                    {"268", "Swaziland"},
                    {"269", "Comoros"},
                    {"269", "Mayotte Island"},
                    {"27", "South Africa"},
                    {"290", "St. Helena"},
                    {"291", "Eritrea"},
                    {"297", "Aruba"},
                    {"298", "Faroe Islands"},
                    {"299", "Greenland"},
                    {"30", "Greece"},
                    {"31", "Netherlands"},
                    {"32", "Belgium"},
                    {"33", "France"},
                    {"34", "Spain"},
                    {"350", "Gibraltar"},
                    {"351", "Portugal"},
                    {"352", "Luxembourg"},
                    {"353", "Ireland"},
                    {"354", "Iceland"},
                    {"355", "Albania"},
                    {"356", "Malta"},
                    {"357", "Cyprus"},
                    {"358", "Finland"},
                    {"359", "Bulgaria"},
                    {"36", "Hungary"},
                    {"370", "Lithuania"},
                    {"371", "Latvia"},
                    {"372", "Estonia"},
                    {"373", "Moldova"},
                    {"374", "Armenia"},
                    {"375", "Belarus"},
                    {"376", "Andorra"},
                    {"377", "Monaco"},
                    {"378", "San Marino"},
                    {"380", "Ukraine"},
                    {"381", "Serbia"},
                    {"382", "Montenegro"},
                    {"385", "Croatia"},
                    {"386", "Slovenia"},
                    {"387", "Bosnia & Herzegovina"},
                    {"389", "Macedonia (Former Yugoslav Rep of.)"},
                    {"39", "Italy"},
                    {"39", "Vatican City"},
                    {"379", "Vatican City"},
                    {"40", "Romania"},
                    {"41", "Switzerland"},
                    {"420", "Czech Republic"},
                    {"421", "Slovak Republic"},
                    {"423", "Liechtenstein"},
                    {"43", "Austria"},
                    {"44", "United Kingdom"},
                    {"45", "Denmark"},
                    {"46", "Sweden"},
                    {"47", "Norway"},
                    {"48", "Poland"},
                    {"49", "Germany"},
                    {"500", "Falkland Islands (Malvinas)"},
                    {"501", "Belize"},
                    {"502", "Guatemala"},
                    {"503", "El Salvador"},
                    {"504", "Honduras"},
                    {"505", "Nicaragua"},
                    {"506", "Costa Rica"},
                    {"507", "Panama"},
                    {"508", "St. Pierre & Miquelon"},
                    {"509", "Haiti"},
                    {"51", "Peru"},
                    {"52", "Mexico"},
                    {"53", "Cuba"},
                    {"5399", "Cuba (Guantanamo Bay)"},
                    {"5399", "Guantanamo Bay"},
                    {"54", "Argentina"},
                    {"55", "Brazil"},
                    {"56", "Chile"},
                    {"56", "Easter Island"},
                    {"57", "Colombia"},
                    {"58", "Venezuela"},
                    {"590", "Guadeloupe"},
                    {"591", "Bolivia"},
                    {"592", "Guyana"},
                    {"593", "Ecuador"},
                    {"594", "French Guiana"},
                    {"595", "Paraguay"},
                    {"596", "French Antilles"},
                    {"596", "Martinique"},
                    {"597", "Suriname"},
                    {"598", "Uruguay"},
                    {"599", "Curaçao"},
                    {"599", "Netherlands Antilles"},
                    {"60", "Malaysia"},
                    {"61", "Australia"},
                    {"61", "Cocos-Keeling Islands"},
                    {"618", "Christmas Island"},
                    {"62", "Indonesia"},
                    {"63", "Philippines"},
                    {"64", "Chatham Island (New Zealand)"},
                    {"64", "New Zealand"},
                    {"65", "Singapore"},
                    {"66", "Thailand"},
                    {"670", "East Timor"},
                    {"670", "Timor Leste"},
                    {"672", "Antarctica"},
                    {"672", "Australian External Territories"},
                    {"672", "Norfolk Island"},
                    {"673", "Brunei Darussalam"},
                    {"674", "Nauru"},
                    {"675", "Papua New Guinea"},
                    {"676", "Tonga Islands"},
                    {"677", "Solomon Islands"},
                    {"678", "Vanuatu"},
                    {"679", "Fiji Islands"},
                    {"680", "Palau"},
                    {"681", "Wallis and Futuna Islands"},
                    {"682", "Cook Islands"},
                    {"683", "Niue"},
                    {"685", "Samoa"},
                    {"686", "Kiribati"},
                    {"687", "New Caledonia"},
                    {"688", "Tuvalu"},
                    {"689", "French Polynesia"},
                    {"690", "Tokelau"},
                    {"691", "Micronesia, (Federal States of)"},
                    {"692", "Marshall Islands"},
                    {"76", "Kazakhstan"},
                    {"77", "Kazakhstan"},
                    {"7", "Russia"},
                    {"800", "International Freephone Service"},
                    {"808", "International Shared Cost Service (ISCS)"},
                    {"808", "Wake Island"},
                    {"81", "Japan"},
                    {"82", "Korea (South)"},
                    {"84", "Vietnam"},
                    {"850", "Korea (North)"},
                    {"852", "Hong Kong"},
                    {"853", "Macao"},
                    {"855", "Cambodia"},
                    {"856", "Laos"},
                    {"86", "China (PRC)"},
                    {"870", "Inmarsat SNAC"},
                    {"871", "Inmarsat (Atlantic Ocean - East)"},
                    {"872", "Inmarsat (Pacific Ocean)"},
                    {"873", "Inmarsat (Indian Ocean)"},
                    {"874", "Inmarsat (Atlantic Ocean - West)"},
                    {"878", "Universal Personal Telecommunications (UPT)"},
                    {"880", "Bangladesh"},
                    {"881", "Global Mobile Satellite System (GMSS)"},
                    {"8810", "ICO Global (Mobile Satellite Service)"},
                    {"8811", "ICO Global (Mobile Satellite Service)"},
                    {"8812", "Ellipso (Mobile Satellite service)"},
                    {"8813", "Ellipso (Mobile Satellite service)"},
                    {"8816", "Iridium (Mobile Satellite service)"},
                    {"8817", "Iridium (Mobile Satellite service)"},
                    {"8818", "Globalstar (Mobile Satellite Service)"},
                    {"8819", "Globalstar (Mobile Satellite Service)"},
                    {"88213", "EMSAT (Mobile Satellite service)"},
                    {"88216", "Thuraya (Mobile Satellite service)"},
                    {"886", "Taiwan"},
                    {"90", "Turkey"},
                    {"91", "India"},
                    {"92", "Pakistan"},
                    {"93", "Afghanistan"},
                    {"94", "Sri Lanka"},
                    {"95", "Myanmar"},
                    {"960", "Maldives"},
                    {"961", "Lebanon"},
                    {"962", "Jordan"},
                    {"963", "Syria"},
                    {"964", "Iraq"},
                    {"965", "Kuwait"},
                    {"966", "Saudi Arabia"},
                    {"967", "Yemen"},
                    {"968", "Oman"},
                    {"970", "Palestinian Settlements"},
                    {"971", "United Arab Emirates"},
                    {"972", "Israel"},
                    {"973", "Bahrain"},
                    {"974", "Qatar"},
                    {"975", "Bhutan"},
                    {"976", "Mongolia"},
                    {"977", "Nepal"},
                    {"98", "Iran"},
                    {"992", "Tajikistan"},
                    {"993", "Turkmenistan"},
                    {"994", "Azerbaijan"},
                    {"995", "Georgia"},
                    {"996", "Kyrgyz Republic"},
                    {"998", "Uzbekistan"}};

            for (int i = 0; i < codesArr.length; i++) {
                if (s.equals(codesArr[i][0])) { // ищем совпадение кода

                    return codesArr[i][1]; // выдаём страну
                }
            }

            return ""; // иначе выдаём пустую строку
        }
    }
