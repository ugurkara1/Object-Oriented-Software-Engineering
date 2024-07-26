package HaberObserver;

//ONewsChannel sınıfı (Observer arayüzüyle uyumlu)
public class OHaberKanali implements Observer {
 private String haber;

 @Override
 public void update(Observable o, Object haber) {
     this.setHaber((String) haber);
 }

 // Standart getter ve setter
 public String getHaber() {
     return haber;
 }

 public void setHaber(String haber) {
     this.haber = haber;
 }
}
