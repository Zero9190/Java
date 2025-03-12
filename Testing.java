
class CarBrand 
{
    
    public void carModel()
    {

        System.out.println("Cars");

    } 

}


class Audi extends CarBrand
{

    public void carModel()
    {

        System.out.println("Audi R8");

    }

}

class Lambhorghini extends CarBrand
{

    public void carModel()
    {

        System.out.println("Lambhorghini Aventador 2019");

    }

}


public class Testing
{

    public static void main(String[] args)
    {

        CarBrand Car1  = new CarBrand();
        CarBrand Car2 = new Audi();
        CarBrand Car3 = new Lambhorghini();

        Car1.carModel();
        Car2.carModel();
        Car3.carModel();
        

    }

}