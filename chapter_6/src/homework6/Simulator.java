package homework6;

class Simulator {
    Simulator(){

    }
    public void playSound(Animal animal){
        animal.cry();
        System.out.println("它的名字是" +animal.getAnimalName());
    }
}
