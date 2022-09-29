public class Game
    {
        private int players;
        private int score;
        private boolean gameOver;

        public Game()
        {
            players = 1;
            score = 0;
            gameOver = false;
        }

        public int getPlayers()
        {
            return players;
        }

        public int getScore()
        {
            return score;
        }
        public int addPlayer(){
            players=++players;
            return players;
        }


        public void increaseScore(int increase){
            score=score+increase;
        }

       public double averageScorePerPlayer(){
           double average=(double)score/players;
           return average;
       }

        public void end()
        {
            gameOver = true;
        }


    }
