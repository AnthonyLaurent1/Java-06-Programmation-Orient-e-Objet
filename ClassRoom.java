class Classroom {

    public static void main(String[] args) {

        Wilder anthony = new Wilder("Anthony", true);

        anthony.setAware(false);

        Wilder markus = new Wilder("Markus", true);
        markus.setFirstname("Marc");

	System.out.println(anthony.whoAmi());
        System.out.println(markus.whoAmi());

    }
   

}
