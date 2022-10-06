public class Food extends Items{

    private Integer hp;

    public Food(String description, Integer hp) {
      super(description);
      this.hp = hp;

  }
  public String toString() {
      return getNameOfItem();

  }
  public Integer getHP() {
        return hp;
  }

}

