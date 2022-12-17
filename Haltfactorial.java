public class Haltfactorial {
    //FACTORIAL OF 1-10;
    public static int fact(int start,int end){
        if(start<end){
            return end * fact( start , end-1 );
        }
        else{
            return end;   //return end me fact(start,end)jo no. bachega..if return 0 hoga to answer 0 hoga
        }//or end hoga to last me jo answer hoga wo!!
    }

    public static void main(String[] args) {
        int Factorial = fact(1,10);  
        System.out.println(Factorial);
    }
 
}

/*//OUTPUT//
fact(1,10)
10*fact(1,9)
10*(9*fact(1,8))
10*(9*(8*fact(1,7)))
10*(9*(8*(7*fact(1,6))))
10*(9*(8*(7*(6*fact(1,5)))))
10*(9*(8*(7*(6*(5*fact(1,4))))))
10*(9*(8*(7*(6*(5*(4*fact(1,3)))))))
10*(9*(8*(7*(6*(5*(4*(3*fact(1,2))))))))
10*(9*(8*(7*(6*(5*(4*(3*(2*fact(1,1)))))))
10*(9*(8*(7*(6*(5*(4*(3*(2*return end=1))))))
10*9*8*7*6*5*4*3*2*1=3628800
*/