@FunctionalInterface
// functional interface meaning jiske ander sird yak method ho not more than one

interface functionalInterface{
    void parul();
}
interface withOneParamter{
    void sura(int rollNo);
}
interface withTwoParameter{
    void completeName(String name,String surName);
}
public class LambdaExpressionWithFunctionalInterface {
    public static void main(String[] args) {
        // for "No" parameter
        functionalInterface onj0 = () -> System.out.println("my name is parul");
        onj0.parul();

        withOneParamter onj1 = (int rollNp) -> System.out.println("my roll no is "+ rollNp);
        onj1.sura(1007);

        withTwoParameter onj2 = (String name,String surName) -> System.out.println("my complete name is "+name+" "+surName);
        onj2.completeName("Parul", "Sura");
    }
}
