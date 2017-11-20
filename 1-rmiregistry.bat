@echo off
echo Certifique-se que limpou e construiu o projeto no NetBeans (Shift+F11) para compilar as classes .java
pause
cd build\classes

IF EXIST *.class (
		echo %cd% rmic rmic *Impl.class
		echo.
		rmic rmic *Impl.class
    ) ELSE (
		@echo Volta no NetBeans e aperta Shift+F11!
		pause
		exit
    )
@echo on
rmiregistry