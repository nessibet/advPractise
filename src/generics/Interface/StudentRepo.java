package generics.Interface;

public class StudentRepo implements Repository<Student>{

    @Override
    public void add(Student student) {
        System.out.println(student.getName() + "Basariyla kaydedildi");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName() + "Basariyla bulundu");

    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName() + "Basariyla guncellendi"+ student.getName()+"update");


    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName() + "Basariyla silindi");


    }
}
