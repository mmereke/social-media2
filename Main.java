public class Main {
    public static void main(String[] args) {
        class Post {
            private int likes;
            private int comments;
            private int saved;

            public Post(int likes, int comments, int saved) {
                this.likes = likes;
                this.comments = comments;
                this.saved = saved;
            }

            public String getPost() {
                return "likes: " + likes + ", comments: " + comments + ", saved: " + saved;
            }
        }

        class Profile {
            private int followers;
            private int following;
            private String username;

            public Profile(int followers,int following, String username) {
                this.followers = followers;
                this.following = following;
                this.username = username;
            }

            public String getProfile() {
                return "followers: " + followers + ", following: " + following + ", username: " + username;
            }
        }

        class Socialnetwork {
            private String app;
            private float rating ;

            public Socialnetwork(String app, float rating) {
                this.app = app;
                this.rating = rating;
            }

            public String getSocialnetwork() {
                return "App: " + app + ", Rating: " + rating;
            }
        }

        Post post = new Post(111, 45, 12);
        Profile profile = new Profile(125, 245, "casvelvet");
        Socialnetwork Socialnetwork = new Socialnetwork("Pinterest", 9.34f);

        System.out.println(post.getPost());
        System.out.println(profile.getProfile());
        System.out.println(Socialnetwork.getSocialnetwork());
    }
}