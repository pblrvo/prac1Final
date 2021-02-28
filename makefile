compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin	
ejecutar:compilar
	java -cp bin aplicacion.Main
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm libreta.jar Manifest.txt -C bin .
