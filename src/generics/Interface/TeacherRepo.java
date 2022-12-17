package generics.Interface;

public class TeacherRepo implements Repository<Teacher>{

    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getName() + "Basariyla kaydedildi");

    }

    @Override
    public void get(Teacher teacher) {
        System.out.println(teacher.getName() + "Basariyla bulundu");

    }

    @Override
    public void update(Teacher teacher) {

        System.out.println(teacher.getName() + "Basariyla guncellendi" + teacher.getName()+"update");

    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println(teacher.getName() + "Basariyla silindi");


    }
}
