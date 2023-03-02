import java.util.Scanner;

public class printNumbers {
    static void printing_numbers(int num){

        String newNum =String.valueOf(num);//converting intiger to string 
        String[] newArray=newNum.split("");//splitting each numbers of converted string and storing in a string array
    
        //creating arrays of numbers in words
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
        String[] twodigits = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"}; 

//cheking the length of numbers to identify the digit(one or two or three)
        if(newNum.length()==1){
            System.out.println(onedigit[num]);//if it is one then take element direct from onedigit array    
        }
        else if(newNum.length()==2){//if it is two digit 

            if(newArray[0].equals("1")){//if it is two digit and the first element is one - because itis a special case it become ten,eleven,... rather than twenty one,thirty four....
                System.out.println(twodigits[Integer.parseInt(newArray[1])]);
            }
            else{
                System.out.println(multipleoftens[Integer.parseInt(newArray[0])]+" "+onedigit[Integer.parseInt(newArray[1])]);
            }
        }
        else{//if it is two digit
            if(newArray[1].equals("1")){//if it is two digit and second element is one 
                System.out.println(onedigit[Integer.parseInt(newArray[0])]+" Hundred "+twodigits[Integer.parseInt(newArray[2])]);
            }
            else{
                System.out.println(onedigit[Integer.parseInt(newArray[0])]+" Hundred "+multipleoftens[Integer.parseInt(newArray[1])]+" "+onedigit[Integer.parseInt(newArray[2])]);
            }
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        printNumbers.printing_numbers(num);
}
}
    

