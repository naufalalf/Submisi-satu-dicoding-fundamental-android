package com.naufalalf.submisionsatu;

import java.util.ArrayList;

public class FilmData  {
    public static String[][] datafilm = new String[][]{
            {"Joker","https://image.tmdb.org/t/p/w185_and_h278_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg","83%","October 2, 2019","During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure."},
            {"Aquaman","https://image.tmdb.org/t/p/w185_and_h278_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg","68%","December 7, 2018","Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people"},
            {"Avanger Invinity War","https://image.tmdb.org/t/p/w185_and_h278_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","83%","April 25, 2018","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."},
            {"Black Panther","https://image.tmdb.org/t/p/w185_and_h278_bestv2/uxzzxijgPIY7slzFvMotPv8wjKA.jpg","74%","February 13, 2018", "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne"},
            {"Bohemian Rhapsody","https://image.tmdb.org/t/p/w185_and_h278_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg","80%","October 24, 2018","Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics."},
            {"Ant-Man and the Wasp","https://image.tmdb.org/t/p/w185_and_h278_bestv2/eivQmS3wqzqnQWILHLc4FsEfcXP.jpg","70%","July 4, 2018","Just when his time under house arrest is about to end, Scott Lang once again puts his freedom at risk to help Hope van Dyne and Dr. Hank Pym dive into the quantum realm and try to accomplish, against time and any"},
            {"Hotel Transilvania 3: Summer Vacation","https://image.tmdb.org/t/p/w185_and_h278_bestv2/gjAFM4xhA5vyLxxKMz38ujlUfDL.jpg","68%","June 28, 2018","Dracula, Mavis, Johnny and the rest of the Drac Pack take a vacation on a luxury Monster Cruise Ship, where Dracula falls in love with the ship’s captain, Ericka, who’s secretly a descendant of Abraham Van Helsing"},
            {"Deadpool","https://image.tmdb.org/t/p/w185_and_h278_bestv2/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg","74%","May 10, 2018","Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life."},
            {"The Nun","https://image.tmdb.org/t/p/w185_and_h278_bestv2/sFC1ElvoKGdHJIWRpNB3xWJ9lJA.jpg","56%","September 5, 2018","When a young nun at a cloistered abbey in Romania takes her own life, a priest with a haunted past and a novitiate on the threshold of her final vows are sent by the Vatican to investigate. Together they uncover"},
            {"Incridibles 2","https://image.tmdb.org/t/p/w185_and_h278_bestv2/9lFKBtaVIhP7E2Pk0IY1CwTKTMZ.jpg","75%","June 14, 2018","Elastigirl springs into action to save the day, while Mr. Incredible faces his greatest challenge yet – taking care of the problems of his three children."},
            {"Ralph Break the Internet","https://image.tmdb.org/t/p/w185_and_h278_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg","72%","November 20, 2018","Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their"},
            {"Jumanji: The Next Level","https://image.tmdb.org/t/p/w185_and_h278_bestv2/jyw8VKYEiM1UDzPB7NsisUgBeJ8.jpg","67%","December 4, 2019","As the gang return to Jumanji to rescue one of their own, they discover that nothing is as they expect. The players will have to brave parts unknown and unexplored in order to escape the world’s most dangerous game."},
            {"Star Wars: The Rise of Skywalker","https://image.tmdb.org/t/p/w185_and_h278_bestv2/db32LaOibwEliAmSL2jjDF6oDdj.jpg","66%","December 18, 2019","The surviving Resistance faces the First Order once again as the journey of Rey, Finn and Poe Dameron continues. With the power and knowledge of generations behind them, the final battle begins."},
            {"Mortal Engine","https://image.tmdb.org/t/p/w185_and_h278_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg","61%","November 27, 2018","Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom"},
            {"Frozen II","https://image.tmdb.org/t/p/w185_and_h278_bestv2/pjeMs3yqRmFL3giJy4PMXWZTTPa.jpg","70%","November 20, 2019","Elsa, Anna, Kristoff and Olaf head far into the forest to learn the truth about an ancient mystery of their kingdom."},
            {"Gundala","https://image.tmdb.org/t/p/w185_and_h278_bestv2/eU0orGizEpOli4wtN8HtfOOJDlA.jpg","53%","August 29, 2019","Sancaka has lived on the streets since his parents left him. Living a hard life, Sancaka survives by thinking about his own safety. When the condition of the city gets worse and injustice rages throughout the country"},
            {"Spiderman-Into The Spider Verse","https://image.tmdb.org/t/p/w185_and_h278_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg","84%","December 6, 2018","Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."},
            {"Spiderman: Far From Home","https://image.tmdb.org/t/p/w185_and_h278_bestv2/4q2NNj4S5dG2RLF9CpXsej7yXl.jpg","76%","June 28, 2019","Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters"},
            {"Avanger: Endgame","https://image.tmdb.org/t/p/w185_and_h278_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg","83%","April 24, 2019","After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store."},
            {"Venom","https://image.tmdb.org/t/p/w185_and_h278_bestv2/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg","66%","September 28, 2018","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect"}
    };
    public static ArrayList<ItemFilm> getData() {
        ArrayList<ItemFilm> filmArrayList = new ArrayList<>();
        for (String[] aData : datafilm) {
            ItemFilm item = new ItemFilm();
            item.setJudul(aData[0]);
            item.setGambar(aData[1]);
            item.setRating(aData[2]);
            item.setRilis(aData[3]);
            item.setSinopsis(aData[4]);
            filmArrayList.add(item);
        }
        return filmArrayList;
    }

}
