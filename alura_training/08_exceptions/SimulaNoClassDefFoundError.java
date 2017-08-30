class TemQueApagarOClassDessaClasse {
	/* apos compilar, temos que apagar esse .class para o teste funcionar */
}

class SimulaNoDefFound {
	public static void main(String[] args) {
	
		new TemQueApagarOClassDessaClasse();

	}
}

/*
	$ java SimulaNoDefFound
	Exception in thread "main" 
			java.lang.NoClassDefFoundError: TemQueApagarOClassDessaClasse
	        at SimulaNoDefFound.main(SimulaNoClassDefFoundError.java:8)
	Caused by: java.lang.ClassNotFoundException: TemQueApagarOClassDessaClasse
	        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:335)
	        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	        ... 1 more
*/