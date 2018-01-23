package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
Требования:


6. В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев в интерфейсах.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{

        private IncomeData data;
        public IncomeDataAdapter(IncomeData data){
            this.data = data;
        }
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() +", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String full = String.format("%010d", data.getPhoneNumber());
            String tel1 = "+" + data.getCountryPhoneCode();
            String tel2 = full.substring(0,3);
            String tel3 = full.substring(3,6);
            String tel4 = full.substring(6,8);
            String tel5 = full.substring(8,10);
            String telFormated = String.format("%s(%s)%s-%s-%s", tel1, tel2, tel3, tel4, tel5);
        return telFormated;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}