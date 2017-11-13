package advance;

public class EnumClass
{


  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Animal animal = Animal.CAT;
    switch (animal) {
      case CAT:
        System.out.println("Cat");
        break;
      case DOG:
        System.out.println("Dog");
        break;
      case MOUSE:
        break;
      default:
        break;
    }

    System.out.println(Animal.DOG.getClass());

    System.out.println(Animal.DOG.getName());
  }

}
