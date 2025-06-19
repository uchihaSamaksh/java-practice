package com.GFG.gfg;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class StudentModelClass implements Iterable<StudentModelClass>{
    private String name;
    private int age;
    private String city;
    private String _id;
    private String eligiblity;
    private List<String> phones;

    public StudentModelClass(String name, int age, String city, String _id){
        this.name = name;
        this.age = age;
        this.city = city;
        this._id = _id;
    }

    public StudentModelClass(String name, int age, String city, String _id, List<String> phones){
        this.name = name;
        this.age = age;
        this.city = city;
        this._id = _id;
        this.phones = phones;
    }

    public StudentModelClass(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String get_id(){
        return _id;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getEligiblity(){
        return eligiblity;
    }

    public void setEligiblity(String eligiblity){
        this.eligiblity = eligiblity;
    }

    public List<String> getPhones(){
        return phones;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(Objects.isNull(o))
            return false;
        if(o.getClass() != StudentModelClass.class)
            return false;
        // if(this._id.equals(o.get_id()))
        if(this.name.equals(((StudentModelClass) o).getName()) && this.age == ((StudentModelClass) o).getAge() && this.city.equals(((StudentModelClass) o).getCity()))
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, city, _id);
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getAge() + " " + this.getCity() + " " + this.get_id() + " " + this.getEligiblity();
    }

    
}
