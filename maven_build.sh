for dir in */; do
    mvn clean package -f "./${dir}pom.xml"
done;