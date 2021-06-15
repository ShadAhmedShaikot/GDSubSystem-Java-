/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuvo
 */
abstract class Person{
        abstract String getDistrict();
        abstract void setDistrict(String district);
        abstract String getThana();
        abstract void setThana(String thana);
        abstract String getPo();
        abstract void setPo(String po);
        abstract String getVillage();
        abstract void setVillage(String village);
        abstract String getName();abstract void setName(String name);
        abstract String setNidNumber();abstract void setNidNumber(String NidNumber); 
    } 
    
    class Complainant extends Person{
        private String name;
        private String NidNumber;
        private String district,thana,po,village;
        @Override
        public String getDistrict() {
            return district;
        }
        @Override
        public void setDistrict(String district) {
            this.district = district;
        }
        @Override
        public String getThana() {
            return thana;
        }
        @Override
        public void setThana(String thana) {
            this.thana = thana;
        }
        @Override
        public String getPo() {
            return po;
        }
        @Override
        public void setPo(String po) {
            this.po = po;
        }
        @Override
        public String getVillage() {
            return village;
        }
        @Override
        public void setVillage(String village) {
            this.village = village;
        }
        @Override
        public String getName() {
            return name;
        }
        @Override
        public void setName(String name) {
            this.name = name;
        }
        public String getNidNumber() {
            return NidNumber;
        }
        @Override
        public void setNidNumber(String NidNumber) {
            this.NidNumber = NidNumber;
        }

        @Override
        String setNidNumber() {
            return this.NidNumber; //To change body of generated methods, choose Tools | Templates.
        }
    }
    class Hostile extends Person{
        private String name;
        private String NidNumber;
        private String district,thana,po,village;
        @Override
        public String getDistrict() {
            return district;
        }
        @Override
        public void setDistrict(String district) {
            this.district = district;
        }
        @Override
        public String getThana() {
            return thana;
        }
        @Override
        public void setThana(String thana) {
            this.thana = thana;
        }
        @Override
        public String getPo() {
            return po;
        }
        @Override
        public void setPo(String po) {
            this.po = po;
        }
        @Override
        public String getVillage() {
            return village;
        }
        @Override
        public void setVillage(String village) {
            this.village = village;
        }
        @Override
        public String getName() {
            return name;
        }
        @Override
        public void setName(String name) {
            this.name = name;
        }
        public String getNidNumber() {
            return NidNumber;
        }
        @Override
        public void setNidNumber(String NidNumber) {
            this.NidNumber = NidNumber;
        }

        @Override
        String setNidNumber() {
            return this.NidNumber; //To change body of generated methods, choose Tools | Templates.
        }
    }
   

