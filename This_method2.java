class This_method2
{
    private String subject;
    private int numSub;
    This_method2(String subject,int numSub)
    {
        this.subject=subject;
        this.numSub=numSub;
    }
    public void display()
    {
        System.out.println("Name of a subject is "+subject);
        System.out.println("Number of subjects are "+numSub);
    }
}
class student
{
    public static void main(String[] args) {
        This_method2 HW=new This_method2("English,Science,Maths",3);
        HW.display();
    }
}
