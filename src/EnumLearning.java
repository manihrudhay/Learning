public class EnumLearning {

    enum Gender {

        MALE("ma"),FEMALE("fa"),;
        final String gender;

        Gender(){this.gender = "emale";}
        Gender(String gender) {
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        System.out.println(Gender.MALE.gender);
        System.out.println(Gender.FEMALE.gender);
//        System.out.println(Gender.E.gender);
    }
}




