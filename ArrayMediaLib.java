
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(){
        String[] sharingFriends = {"Adrian", "Sean", "Rishabh", "John", "Michael"};
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        Song[] topTenSongs = {new Song("The Twist"), 
                              new Song("Smooth"),     
                              new Song("Mack the Knife"), 
                              new Song("How do I live"),  
                              new Song("Party Rock Anthem"),  
                              new Song("I gotta feeling"),  
                              new Song("Macarena"),  
                              new Song("Physical"),  
                              new Song("You light up my Life"),  
                              new Song("Hey Jude")
                            };
        int total = 0;
        for(int i = 0; i< sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        for(int t: daysBtwnPurchase) {
            total += t;
        }
        for (Song s: topTenSongs) {
            System.out.println(s.getTitle());
        }
        System.out.println(total);
    }
}
