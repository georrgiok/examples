import jav.Lib_folder.Lib;

/**Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
 * Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей и отношений между людьми: 
 * родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. компонент для проведения исследований
 *  дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение 
 * отдельных моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека. */

/**
 * + Передача метода вывода People из клиентского кода+
 * Перебор People через for in
 * Приведение People к строке
 */
 
public class E7_01 {
    public static void main(String[] args) {
        
        People ded = new People("петр",1966,"male");
        People bab = new People("вера",1967,"female");
        People pa = new People("иван",1986,"male");
        People ma = new People("ирина",1965,"female");
        People chil1 = new People("анна",2015,"female");
        People chil2 = new People("илья",2017,"male");
        People pchil3 = new People("валерия",2013,"female");
        People chil4 = new People("валентин",2019,"male");
        People mother = new People("жанна",1996,"female");
        People father = new People("антон",1994,"male");
 
        father.addFather(pa);
        father.addMother(ma);
        father.addChild(chil4);
        father.addChild(pchil3);
        father.addChild(chil2);
        father.addChild(chil1);
        mother.addChild(chil4);
        mother.addChild(pchil3);
        mother.addChild(chil1);
        mother.addChild(chil2);
        ded.addChild(pa);
        bab.addChild(ma);

        People.SelectOutput(new PrintToFile("jav/E7/tree.txt"));
        

       // People.ToFile("jav/E7/tree.txt");///
        father.seeSisters();
        chil2.see();
        People.SelectOutput(new PrintToConsole());
        //People.ToConsole();///
        chil2.seeSisters();

        for (iterable_type iterable_element : father) {
            
        }

       


    }

    




}
