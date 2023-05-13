interface parul{
    int num = 6;
    void show();
}

class InterfaceBaiscs{
    /*
     * Interface
     * 
     * It will allow only abstract methods
     * It cannot be instantiated
     * Or we can't make objects from Interfce
     * Variables are "public static final" by default
     * Methods are "public and abstract" by default
     * 
     * No Constructor in Interface is there
     * 
     */
    public static void main(String[] args) {
        System.out.println(parul.num);
    }
}