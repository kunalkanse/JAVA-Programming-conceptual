
class VariadicFun1
{

    public static void Variadic(int...A)
    {
        for(int x : A)
        {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) 
    {
        Variadic();
        Variadic(10,20,30);
        Variadic(new int[]{11,21,31,41,51});
    }
}
