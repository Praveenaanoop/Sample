package intro;

public class ControlStatements {
    public static void main(String[] args) {
        int age=17;

        //simple if statement contains only if condition if it contains else then it is else if
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible");
        }

        //nested if inner if contains no else part
        int a=300;
        if(a<200){
            if(a==80){
                System.out.println("True");
            }
        }
        else{
            System.out.println("incorrect statement");
        }


        //else if ladder
        int month=7;
        if(month==1){
            System.out.println("January");
        }else if(month==2){
            System.out.println("February");
        }else if(month==3){
            System.out.println("March");
        }else if(month==4){
            System.out.println("April");
        }else if(month==5){
            System.out.println("May");
        }
        else
        {
            System.out.println("None of these");
        }

        //switch statement
        int mon=2;
        switch (mon){
            case 1 : System.out.println("January");
                     break;
            case 2:System.out.println("February");
                break;
            case 3:System.out.println("March");
                break;
            default:System.out.println("Months");
        }
//by using string as the case in switch statement
        String mont="March";
        switch (mont){
            case "January" : System.out.println("January");
                break;
            case "February":System.out.println("February");
                break;
            case "March":System.out.println("March");
                break;
            default:System.out.println("Months");
        }
    }
}
