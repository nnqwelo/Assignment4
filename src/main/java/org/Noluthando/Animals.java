package org.Noluthando;

public class Animals {
    public String animalType;
    public String name;

    public Animals(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;

    }


    public String getName(){
        return name;
    }

    public void setName(int id) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;

    }
    public void setAnimalType(){
        this.animalType = animalType;

    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((name== null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animals other = (Animals) obj;
        if (name == null){
            if (other.name != null)
                return false;
        }else if(name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}

