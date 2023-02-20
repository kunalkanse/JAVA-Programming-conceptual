
class VariadicFun2
{

    public static void Variadic(String ...A)
    {
        for(String x : A)
        {
            System.out.print(x + " ");
        }

        System.out.println();

        for(int i = 0; i<A.length;i++)
        {
            System.out.println(i+1 + " : " + A[i]);
        }
    }

    public static void main(String[] args) 
    {
        Variadic("I","love","you");
    }
}