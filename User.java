import java.time.LocalDate;

public class User {
    protected
        String name;
        LocalDate dob;
    public
        User(){
            name = null;
            dob = LocalDate.now(); // current date
        }
        User(String name, int year, String month, int day){
                this.name = name;
                String[] month_array = {"January", "February", "March", "April", "May", "June"
                        , "July", "August", "September", "October", "November", "December"};
                int month_Toint = 0;
                for(int i = 0; i <= 12; i++){
                    if(month == month_array[i]) {
                        month_Toint = i+1;
                        break;
                    }
                    else if(i == 11 && month != month_array[i]) month_Toint = 12;
                }
                dob = LocalDate.of(year,month_Toint,day);
            }
        User(String name, int year, int month_int, int day){
            this.name = name;
            dob = LocalDate.of(year, month_int, day);
        }
            protected void displayInfo(){
                System.out.println("User name: " + this.name);
                System.out.println("User Birthday: " + dob);
            }
}
