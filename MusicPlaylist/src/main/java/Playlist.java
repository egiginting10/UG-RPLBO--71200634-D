public class Playlist {

    public static long HOURS = 60 * 60 * 1000;
    public static long MINS = 60 * 1000;
    public static long SECS = 1000;
    private static Song[] songs;
    private static int count;
    private String playlistName;

    public Playlist() {
        songs = new Song[7];
        count = 0;
    }
    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlayListName(String favorite) {
        this.playlistName = playlistName;
    }

    public void add(Song a) {
        if(count == songs.length) {
            System.out.println("ERROR: PLAYLIST PENUH. SONG TIDAK AKAN DITAMBAHKAN.");
        }
        songs[count] = a;
        count++;
    }

    public Song get(int i) {
        if(count > i) {
            return songs[i];
        }
        else {
            return null;
        }
    }
    public Song remove(String name) {
        boolean found = false;
        int indexToRemove = 0;
        while(indexToRemove < count && !found) {
            if(songs[indexToRemove].getName().equals(name)) {
                found = true;
            }
            else {
                indexToRemove++;
            }
        }
        if(indexToRemove < count) {
            for(int from = indexToRemove + 1; from < count; from++) {
                songs[from-1] = songs[from];
            }
            songs[count-1] = null;
            count--;
        }
        return null;
    }

    public static void print() {
        String result = "Jumlah Lagu = " + count
                + " / Kapasitas Playlist = " + songs.length + "\n";

        for (int i=0; i<count; i++) {
            result += ("ListSong[" + i + "] : "
                    + songs[i] + ">\n");
        }
        System.out.println(result.toString() + "\n");
    }
    public int size() {
        return count;
    }
    public int totalTime() {
        int totalTime = 0;
        for (int i=0; i<count; i++) {
            totalTime += songs[i].getLength();
        }
        return totalTime;
    }
    public String formattedTotalTime() {
        long time = totalTime();
        String lengthString;
        double overflow = time;
        long h = time / HOURS;
        long overFlow = time % HOURS;
        long m = overFlow / MINS;
        overFlow = time % MINS;
        long s = overFlow / SECS;
        lengthString = String.format("%02d",h) + ":" +
                String.format("%02d",m) + ":" +
                String.format("%02d",s);
        return lengthString;
    }

}   