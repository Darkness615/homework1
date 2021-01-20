import animal.lesson6.Animal;
import animal.lesson6.Cat;
import animal.lesson6.Dog;

public class main
{
    static public void main(String[] args)
    {
        task();
    }

    static public void task()
    {
        Animal [] animal =
                {
                        new Cat("Snow"),
                        new Dog("Bobik"),
                        new Cat("Barsik"),
                        new Dog("Zuchka")

                };

        for (int i=0; animal.length>i;i++)
        {
            animal[i].run(500);
            animal[i].swim(500);
        }

    }

}
