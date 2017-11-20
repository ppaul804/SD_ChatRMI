@echo off
echo Certifique-se que limpou e construiu o projeto no NetBeans (Shift+F11) para compilar as classes .java
pause
cd build\classes

IF EXIST comum (
		echo %cd% rmic comum.MensageiroImpl
		echo.
		rmic comum.MensageiroImpl
    ) ELSE (
		@echo Volta no NetBeans e aperta Shift+F11!
		pause
		exit
    )
@echo on
rmiregistry