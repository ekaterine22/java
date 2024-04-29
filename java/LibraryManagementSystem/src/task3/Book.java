package task3;

public class Book {
    private String title;
    private String composer;
    private String genre;
    private int difficultyLevel;
    private String musicLink;

    public Book(String title, String composer, String genre, int difficultyLevel, String musicLink) {
        this.title = title;
        this.composer = composer;
        this.genre = genre;
        this.difficultyLevel = difficultyLevel;
        this.musicLink = musicLink;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getMusicLink() {
        return musicLink;
    }

    public void setMusicLink(String musicLink) {
        this.musicLink = musicLink;
    }
}
