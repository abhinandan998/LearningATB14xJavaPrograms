package ex_23_OOPS_SuperAbstraction;

public class Lab180_Interview_Q {

}
interface l11{}
interface l12{}
class A1{}
class B1{}
//class Test2 extends A1, B1{}
class Test3 implements l11{}
class Test4 implements l12,l11{}
class Test5 extends A1 implements l11, l12{}

//class Test5 implements l11 extends A1{}
//interface l3 extends A1{}