//By: Kent Paulo R. Delgado
//BSCS1A
//Final Java Project 2023
//Pokemon Mini-Fanmade Game

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.*;

public class FinalProject_PP_Delgado {
    private static Clip introPokemon; // Declaring the Clip object at the class level
    private static Clip introPokemon2; // Declaring the Clip object at the class level
    private static Clip introPokemon3; // Declaring the Clip object at the class level
    private static Clip introPokemon4; // Declaring the Clip object at the class level
    private static Clip introPokemon5; // Declaring the Clip object at the class level
    private static Clip inputPoke; // Declaring the Clip object at the class level
    
    //Background IntroMusic
    public static void inputPoke() {
        try {
            File file = new File("../buttons.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            inputPoke = AudioSystem.getClip(); // Use the class-level Clip object
            inputPoke.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            //introPokemon.loop(Clip.LOOP_CONTINUOUSLY);
            inputPoke.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music 1
    public static void introPokemon() {
        try {
            File file = new File("../intro.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            introPokemon = AudioSystem.getClip(); // Use the class-level Clip object
            introPokemon.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            introPokemon.loop(Clip.LOOP_CONTINUOUSLY);
            introPokemon.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music Stopper 1
    public static void stopIntroPokemon() {
        if (introPokemon != null && introPokemon.isRunning()) {
            introPokemon.stop();
            introPokemon.close();
        }
    }
    //Background Music 2
    public static void introPokemon2() {
        try {
            File file = new File("../hero.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            introPokemon2 = AudioSystem.getClip(); // Use the class-level Clip object
            introPokemon2.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            introPokemon2.loop(Clip.LOOP_CONTINUOUSLY);
            introPokemon2.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music Stopper 2
    public static void stopIntroPokemon2() {
        if (introPokemon2 != null && introPokemon2.isRunning()) {
            introPokemon2.stop();
            introPokemon2.close();
        }
    }
    //Background Music 3
    public static void introPokemon3() {
        try {
            File file = new File("../league.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            introPokemon3 = AudioSystem.getClip(); // Use the class-level Clip object
            introPokemon3.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            introPokemon3.loop(Clip.LOOP_CONTINUOUSLY);
            introPokemon3.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music Stopper 3
    public static void stopIntroPokemon3() {
        if (introPokemon3 != null && introPokemon3.isRunning()) {
            introPokemon3.stop();
            introPokemon3.close();
        }
    }
    //Background Music 4
    public static void introPokemon4() {
        try {
            File file = new File("../battle.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            introPokemon4 = AudioSystem.getClip(); // Use the class-level Clip object
            introPokemon4.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            introPokemon4.loop(Clip.LOOP_CONTINUOUSLY);
            introPokemon4.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music Stopper 4
    public static void stopIntroPokemon4() {
        if (introPokemon4 != null && introPokemon4.isRunning()) {
            introPokemon4.stop();
            introPokemon4.close();
        }
    }
    //Background Music 5
    public static void introPokemon5() {
        try {
            File file = new File("../arceus.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            introPokemon5 = AudioSystem.getClip(); // Use the class-level Clip object
            introPokemon5.open(audioStream);
            // Set loop count to LOOP_CONTINUOUSLY for continuous looping
            introPokemon5.loop(Clip.LOOP_CONTINUOUSLY);
            introPokemon5.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //Background Music Stopper 5
    public static void stopIntroPokemon5() {
        if (introPokemon5 != null && introPokemon5.isRunning()) {
            introPokemon5.stop();
            introPokemon5.close();
        }
    }


      //Pokemon Intro Titlepage
      static String block() {
      String name = """
===================================================================================
[*]=============================================================================[*]  
[*]    ,'\\                                                                      [*]  
[*]     _.----.        ____         ,'  _\\   ___    ___     ____                [*]
[*] _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.          [*]
[*] \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |         [*]
[*]  \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |         [*]
[*]    \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |         [*]
[*]     \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |         [*]
[*]      \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |         [*]
[*]       \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |         [*]
[*]        \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |         [*]
[*]         \\_.-'       |__|    `-._ |              '-.|     '-.| |   |         [*]
[*]                                 `'                            '-._|  TM     [*]                                    
[*]              (                          )  (      (                         [*]
[*]              )\\ )       (            ( /(  )\\ )   )\\ )                      [*]
[*]             (()/(  (    )\\ )    (    )\\())(()/(  (()/(                      [*]
[*]              /(_)) )\\  (()/(    )\\  ((_)\\  /(_))  /(_))                     [*]
[*]             (_))  ((_)  /(_))_ ((_)  _((_)(_))_  (_))                       [*]
[*]             | |   | __|(_)) __|| __|| \\| | |   \\ / __|                      [*]
[*]             | |__ | _|   | (_ || _| | .` | | |) |\\__ \\                      [*]
[*]             |____||___|   \\___||___||_|\\_| |___/ |___/                      [*]         
[*]                  ."-,.__                                                    [*]
[*]                  `.     `.  ,                                               [*]
[*]               .--'  .._,'"-' `.                                             [*]
[*]              .    .'         `'                                             [*]
[*]              `.   /          ,'                                             [*]
[*]                `  '--.   ,-"'                                               [*]
[*]                 `"`   |  \\                                                  [*]
[*]                    -. \\, |                                                  [*]
[*]                     `--Y.'      ___.                                        [*]
[*]                          \\     L._, \\                                       [*]
[*]                _.,        `.   <  <\\                _                       [*]
[*]              ,' '           `, `.   | \\            ( `                      [*]
[*]           ../, `.            `  |    .\\`.           \\ \\_                    [*]
[*]          ,' ,..  .           _.,'    ||\\l            )  '".                 [*]
[*]         , ,'   \\           ,'.-.`-._,'  |           .  _._`.                [*]
[*]       ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\               [*]
[*]     .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.             [*]
[*]     |  '          ..         `-...-"  |  `-'      / /        . `.           [*]
[*]     | /           |L__           |    |          / /          `. `.         [*]
[*]    , /            .   .          |    |         / /             ` `         [*]
[*]   / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\        [*]
[*]  / .           \\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.       [*]
[*] .  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\      [*]
[*] ' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`      [*]
[*] |'      _.-""` `.    \\ _,'  `            \\ `.___`.'"`-.  , |   |    | \\     [*]
[*] ||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|     [*]
[*] ||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||     [*]
[*] || '              V      / /           `   | `   ,'   ,' '.    !  `. ||     [*]
[*] ||/            _,-------7 '              . |  `-'    l         /    `||     [*]
[*] . |          ,' .-   ,' ||               | .-.        `.      .'     ||     [*]
[*]  `'        ,'    `".'    |               |    `.        '. -.'       `'     [*]
[*]           /      ,'      |               |,'    \\-.._,.'/'                  [*]
[*]           .     /        .               .       \\    .''                   [*]
[*]         .`.    |         `.             /         :_,'.'                    [*]
[*]           \\ `...\\   _     ,'-.        .'         /_.-'                      [*]
[*]            `-.__ `,  `'   .  _.>----''.  _  __  /                           [*]
[*]                 .'        /"'          |  "'   '_                           [*]
[*]                /_|.-'\\ ,".             '.'`__'-( \\                          [*]
[*]                  / ,"'"\\,'               `/  `-.|" kpd                      [*]
[*]=============================================================================[*]
=================================================================================== 
      """;
      System.out.print(name);
         return name; 
      
 }  
      static String block2() {
      //Dragonite art
      String Dragonite = 
      """
              ,,-,                            ,
          \\  |__,,,,,    ,,,,,~’’’’~,,,-‘./
           ’-,,,,-~-,.\\,,-‘/.,-‘¯¯¯’--,--‘
                   ,-‘\\(‘   |,/ ’-,
                  /                \\
                |,,          ,---,  |           ,---,
                |  |        |    |   \\         |  --,.’-,
               ,|¯¯          ’~’’     |         |  |   \\.’-,
               |’                     |         /    )  \\  \\
           ,-‘’|             ,~|       |      /  ,-‘  |  \\  \\
        ,-‘,-‘¯’-,,,,,,,,,,-‘,-|       |     /  /     | ,-\\  \\
     ,-‘,-‘,-‘’’-/      )---¯---|       \\ ,-‘  /      |  | \\  \\                           , 
  ,-‘,-‘¯     /   ,-‘’’|,,,,,,,,,|      \\’    /      ’||    |  (                         /|
 /         ,-‘ ,-‘   ,/           |      ’-,/ ,,,   ,,-‘’’’-,   |                     ,-‘ |
/~~-,    /,/_,~’’’~’’’’’’’’’’’’’’|          ’-,’ \\,-‘        | /                    ,/   |
’        \\/’’’’   /,,,~~~~,,,,  /      ,      ’-,            |/                  ,-‘     |
       ,-‘      /              |        ’-,       \\                           ,-‘         |
    ,-‘        /~~’’’’’’’’’-,,,|          |        ’-,                     ,-‘           |
 ,-(          /                \\           |          |,                ,-‘              |
  ,-‘-,,--,--|~~~~~~------,,,,,,|          ’-,,-,-‘’’|’,|           ,-‘                 |
    ’  \\,/  |                   \\             \\,| ’-‘        __,-~’’                   /
            |-----------------‘’’\\    ,-‘¯¯’’-,  ’’’’’’’’’’’’                         /
           |                      |  ’          ’-,                                 ,/
          ,| --,,,,,,,,____,,,,,,  |               \\                             ,-‘
         |    |                     |               \\                         ,-‘
         |     \\------,,,,,,,,,,-----|                \\                    ,-‘ 
          \\      ’-,                  |                |              ,,-‘’
           \\        ’-,’’----------‘’’’\\                |        ,-‘’’
            \\        ’’--,,,,,,,,,,,,---‘-,,,           |---‘’;‘`
             `’’--,,,       ’’’---,,,,,,,.’’ ’’~,,,     ’-,,-'
                  ,-‘’         ,-‘ ’’’’’’’’’’’’’’  \\         ’-,
            ,,--‘’          ,-‘                     |           ’-,
         ,-‘             ,-‘                         |      __  __|
        /-~-,--~,     ,-‘                             \\,---/  ’\\  |
       /,,,,/,,,-‘~~’                                  ',  |    ;-‘
                                                         '-’'--'
      """ ;  
      System.out.print(Dragonite);
      return Dragonite;
}
      static String block3() {
      //Pokemon League Art Title
      String announcement = 
      """
==================================================================================
==================================================================================      
       ,'\\                                                                             
       _.----.        ____         ,'  _\\   ___    ___     ____
   _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.
   \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |
    \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |
      \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |
       \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |
        \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |
         \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |
          \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |
           \\_.-'       |__|    `-._ |              '-.|     '-.| |   |
                                   `'                            '-._|  TM                                               
                (                          )  (      (     
                )\\ )       (            ( /(  )\\ )   )\\ )  
               (()/(  (    )\\ )    (    )\\())(()/(  (()/(  
                /(_)) )\\  (()/(    )\\  ((_)\\  /(_))  /(_)) 
               (_))  ((_)  /(_))_ ((_)  _((_)(_))_  (_))   
               | |   | __|(_)) __|| __|| \\| | |   \\ / __|  
               | |__ | _|   | (_ || _| | .` | | |) |\\__ \\  
               |____||___|   \\___||___||_|\\_| |___/ |___/   

                       ('-.   ('-.                               ('-.             
    .-.              _(  OO) ( OO ).-.                         _(  OO)    .-.     
 .-,| |,-. ,--.     (,------./ . --. /  ,----.    ,--. ,--.   (,------..-,| |,-.  
 _\\ ' ' /_ |  |.-')  |  .---'| \\-.  \\  '  .-./-') |  | |  |    |  .---'_\\ ' ' /_  
(__     __)|  | OO ) |  |  .-'-'  |  | |  |_( O- )|  | | .-')  |  |   (__     __) 
  / . . \\  |  |`-' |(|  '--.\\| |_.'  | |  | .--, \\|  |_|( OO )(|  '--.  / . . \\   
 `-'| |`-'(|  '---.' |  .--' |  .-.  |(|  | '. (_/|  | | `-' / |  .--' `-'| |`-'  
    `-'    |      |  |  `---.|  | |  | |  '--'  |('  '-'(_.-'  |  `---.   `-'     
           `------'  `------'`--' `--'  `------'   `-----'     `------'       
==================================================================================
==================================================================================    
       """;
       System.out.print(announcement);
       return announcement;   
  }
      static String block4() {
      // Arceus Lowkey Titlepage
      String Arceus = 
      """
      
                __|_\\| \\_    _______
              /|   /  | \\__/       \\ 
             |_|___   |      _______\\
              |__\\/   |\\____/ _______| 
              |__|/   /\\_____/   
             <_______/
                _/  |__  __  __  __
               /      \\\\/ /  \\ \\/ /
               \\|  |  /O__\\__/ O_ \\      ______
               /\\__/  \\_/___  / _\\ \\____/ ____/
               \\| | | /     \\ \\/ _| |____/___/
                | | | \\      | | \\| |____/
                \\\\ \\/ /_     | |  | |_
                 \\\\/    \\   / /   | |/
                  /   __/__| |    | |
                /|   /     /\\ \\ _/ /
                \\   /|    |__\\ O  /
                 |  /\\     \\ /_/\\_\\\\
                /-//  \\     |\\ |__  \\  
               / // \\ |     | ||  \\ |
              /_//  |_|     |_/   |_|
            
      """;
      System.out.print(Arceus);
      return Arceus;
      
   }
      static String block5() {
      //Pokedex Panel
      String blocklist = 
      """
  POKEDEX: 
  =================================================================================================================================================================================
  || Garchomp[Dragon]      || Blastoise[Water]     || Scizor[Bug]             || Luxray[Electric]     || Torterra[Grass]      || Snorlax[Normal]      || Infernape[Fire]         ||
  || Tyranitar[Dragon]     || Ninetales[Fire]      || Pikachu[Electric]       || Charizard[Fire]      || Hawlucha[Fighting]   || Sceptile[Grass]      || Empoleon[Water]         ||
  || Megasaur[Grass]       || Blaziken[Fire]       || Greninja[Water]         || Haunter[Ghost]       || Salamence[Dragon]    || Raichuu[Electric]    || Caterpie[Bug]           ||
  || Croconaw[Water]       || Flygon[Dragon]       || Ampharos[Electric]      || Typhlosion[Fire]     || Absol[Dark]          || Dragonite[Dragon]    || Eevee[Normal]           ||
  || Gardevoir[Psychic]    || Lucario[Fighting]    || Umbreon[Dark]           || Arcanine[Fire]       || Gengar[Ghost]        || Metagross[Steel]     || Machamp[Fighting]       ||
  || Gyarados[Water]       || Ditto[Normal]        || Aegislash[Steel]        || Haxorus[Dragon]      || Slaking[Normal]      || Hydreigon[Dragon]    || Blissey[Fairy]          ||
  || Ferrothorn[Grass]     || Shedinja[Bug]        || Togekiss[Fairy]         || Goodra[Dragon]       || Mawille[Steel]       || Torkoal[Fire]        || Kangaskhan[Normal]      ||
  || Kingdra[Water]        || Breloom[Grass]       || Skarmory[Flying]        || Rotom[Electric]      || Tangrowth[Grass]     || Magnezone[Electric]  || Mamoswine[Ice]          ||
  || Volcarona[Fire]       || Roserade[Grass]      || Chandelure[Fire]        || Swampert[Water]      || Samurott[Water]      || Feraligatr[Water]    || Emboar[Fire]            ||
  || Delphox[Fire]         || Serperior[Grass]     || Chesnaught[Grass]       || Incineroar[Fire]     || Meganium[Grass]      || Jolteon[Electric]    || Electrivire[Electric]   ||
  || Eelektros[Electric]   || Manetric[Electric]   || Galvantula[Electric]    || Zebstrika[ELectric]  || Emolga[Electric]     || Heliolisk[Electric]  || Vaporeon[Ice]           ||
  || Lapras[Water]         || Milotic[Water]       || Starmie[Water]          || Azumarill[Water]     || Wailord[Water]       || Sharpedo[Water]      || Ludicolo[Water]         ||
  || Crawdaunt[Water]      || Leafeon[Grass]       || Victreebel[Grass]       || Tropius[Grass]       || Gogoat[Grass]        || Houndoom[Dark]       || Magmortar[Fire]         ||
  || Flareon[Fire]         || Rapidash[Fire]       || Victini[Fire]           || Talonflame[Fire]     || Excadrill[Ground]    || Flygon[Dragon]       || Steelix[Steel]          ||
  || Onix[Rock]            || Rhyperior[Ground]    || Sandslash[Ground]       || Seismitoad[Water]    || Dugtrio[Ground]      || Krookodile[Ground]   || Tentacruel[Water]       ||
  || Gastrodon[Water]      || Noivern[Flying]      || Altaria[Dragon]         || Staraptor[Flying]    || Pelipper[Flying]     || Gliscor[Ground]      || Weavile[Dark]           ||
  || Zoroark[Dark]         || Mightyena[Dark]      || Golurk[Ground]          || Honchkrow[Dark]      || Glaceon[Ice]         || Piloswine[Ice]       || Abomasnow[Ice]          ||
  || Froslass[Ice]         || Glalie[Ice]          || Glaceon[Ice]            || Beartic[Ice]         || Jinx[Ice]            || Vanilluxe[Ice]       || Snowver[Ice]            ||
  || Alakazam[Psychic]     || Mr.Mime[Psychic]     || Espeon[Psychic]         || Hypno[Psychic]       || Drowzee[Psychic]     || Gallade[Fighting]    || Slowpoke[Water]         ||
  || Wobbuffet[Psychic]    || Ekans[Poison]        || Arbok[Poison]           || Nidorina[Poison]     || Nidorino[Poison]     || Grimer[Poison]       || Muk[Poison]             ||
  || Weezing[Poison]       || Gulpin[Poison]       || Seviper[Poison]         || Meowth[Normal]       || Persian[Normal]      || Garbodor[Poison]     || Golbat[Poison]          ||
  || Slowbro[Water]        || Crobat[Poison]       || Stunktank[Poison]       || Drapion[Poison]      || Toxicroak[Poison]    || Hitmonlee[Fighting]  || Hitmonchan[Fighting]    ||
  || Hariyama[Fighting]    || Primeape[Fighting]   || Poliwrath[Water]        || Medicham[Fighting]   || Donphan[Ground]      || Geodude[Rock]        || Hippowdon[Ground]       ||
  || Quagsire[Water]       || Marowak[Ground]      || Graveler[Rock]          || Pinsir[Grass]        || Karrablast[Grass]    || Accelgor[Steel]      || Scatterbug[Bug]         ||
  || Butterfree[Bug]       || Weedle[Bug]          || Kakuna[Bug]             || Beedrill[Bug]        || Parasect[Grass]      || Scyther[Grass]       || Ariados[Bug]            ||
  || Heracross[Bug]        || Surskit[Water]       || Combee[Bug]             || Escavalier[Steel]    || Genesect[Steel]      || Misdreavus[Ghost]    || Duskull[Ghost]          ||
  || Drifloon[Ghost]       || Dusclops[Ghost]      || Duskull[Ghost]          || Shuppet[Ghost]       || Sableye[Ghost]       || Driflim[Ghost]       || Aerodactyl[Flying]      ||
  || Dusknoir[Ghost]       || Yamask[Ghost]        || Zoroa[Dark]             || Pidgeotto[Flying]    || Gorgeist[Ghost]      || Florges[Grass]       || Mr.Mime[Psychic]        ||
  || Clefairy[Fairy]       || Dedenne[Electric]    || Omar[Water]             || Gigalith[Rock]       || Pupitar[Bug]         || Armaldo[Rock]        || Porygon[Normal]         ||
  || Aipom[Normal]         || Ursaring[Normal]     || Miltank[Normal]         || Vigoroth[Normal]     || Lopunny[Normal]      || Stoutland[Normal]    || Bunnelby[Normal]        ||
  || Aggron[Steel]         || Klinklang[Steel]     || Bronzong[Steel]         || Bastiodon[Normal]    || Spiritomb[Ghost]     || Drapion[Poison]      || Staraptor[Flying]       ||
  =================================================================================================================================================================================
      """;
      System.out.print(blocklist);
      return blocklist;
  }
      static String block6() {  
      //ElementList
      String blockElements = 
    """
 TYPES OF POKEMON
 =================================================================
 || Normal   || Fire   || Water  || Grass  || Electric || Ice   ||
 || Fighting || Poison || Ground || Flying || Psychic  || Bug   ||
 || Rock     || Ghost  || Dragon || Dark   || Steel    || Fairy ||
 =================================================================
    """;
    System.out.print(blockElements);
    return blockElements;
  }
  static String block7() {
  //Wobbuffet Art
  String blockWobbu = 
   """
        ____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
      __¶¶3333333333333333¶¶¶¶¶¶____¶¶¶¶¶¶333333333333888888¶¶¶¶¶¶
      ¶¶333333888888888888333388¶¶¶¶333uBnoPMiLfyDmtFRnPr1CR3MBRryn3c8¶¶¶¶
      ¶¶333388$$$$$$$$$$$$888888¶¶¶33333uBnoPMiLfyDmtFRnPr1CR3MBRryn3c88¶¶¶¶
      ¶¶3388$$$$$$$$$$$$$$$$$$$¶¶¶333333333uBnoPMiLfyDmtFRnPr1CR3MBRryn3c8$$¶¶
      ¶¶3388$$$$$$$$$$$$$$$$$$¶¶33333333333uBnoPMiLfyDmtFRnPr1CR3MBRryn3c8$$$$¶¶
      ¶¶3388$$$$¶¶¶¶¶¶¶$$$$$$¶¶¶3333333333333333333333333333338888$$$$$$$$$$¶¶
      ¶¶3388$$$$¶¶____¶¶¶¶¶¶¶¶8¶¶¶¶33333333333333333333¶¶¶¶888888888¶¶$$$$$$$$¶¶
      ¶¶88$$$$$$¶¶______¶¶88888888¶¶¶333333333333333¶¶¶¶33338888888888¶¶$$$$$$¶¶
      ¶¶88$$$$$$¶¶____¶¶88888888888¶¶¶¶33333333333¶¶¶¶3333888888888888¶¶$$$$$$$$¶¶
      _¶¶$$$$$$$¶¶____¶¶8888888¶¶¶¶¶88333333333333333¶¶¶¶¶¶88888888888$$¶¶$$$$$$¶¶
      _¶¶$$$$$$$$¶¶_¶¶888888888888888888333333338888888888888888888888$$¶¶$$$$$$$$¶¶
      __¶¶$$$$$$$$¶¶¶¶88888888¶¶¶888¶¶¶¶8888¶¶¶¶8888¶¶¶¶88888888888888$$¶¶¶¶$$$$$$¶¶
      __¶¶$$$$$$$$¶¶¶¶888888¶¶###¶¶¶¶####¶¶¶¶####¶¶¶¶###¶¶8888888888$$$$$$¶¶$$$$$$¶¶
      ___¶¶$$$$$$$$¶¶¶888888¶¶##########################¶¶8888888888$$$$$$¶¶$$$$$$¶¶
      ____¶¶$$$$$$$¶¶¶888888¶¶##########################¶¶8888888888$$$$$$¶¶$$$$$$¶¶
      ____¶¶$$$$$$$$¶¶888888¶¶##########################¶¶88888888$$$$$$$$$¶¶¶$$¶¶
      _____¶¶$$$$$$$$8888888¶¶##########################¶¶88888888$$$$$$$$$$¶¶$$¶¶
      ______¶¶$$$$$$88$$8888¶¶############§§§§§§§§§§§§##¶¶888888$$$$$$$$$$$$¶¶¶¶
      ______¶¶$$$$$$$$88$$888¶¶#######§§§§§§§§§§§§§§§§§§¶¶8888$$$$$$$$$$$$$$¶¶
      ________¶¶$$$$88$$88$$88¶¶####§§§§ƒƒƒƒƒƒƒƒƒƒƒƒ§§§¶¶888$$$$$$$$$$$$$$$$¶¶
      ________¶¶$$$$$$88$$88$$8¶¶§§§ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶88$$$$$$$$$$$$$$$$$$¶¶
      __________¶¶$$$$$$88$$$$$$¶¶##ƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒƒ¶¶$$$$$$$$$$$$$$$$$$##$$¶¶
      __________¶¶$$$$$$$$$$$$$$$$¶¶##ƒƒƒƒƒƒƒƒƒƒƒƒ¶¶$$$$$$$$$$$$$$$$$$######¶¶
      ____________¶¶$$$$$$$$$$$$$$$$¶¶¶¶¶¶¶¶¶¶¶¶¶¶$$$$$$$$$$$$$$$$$$$$#####¶¶
      ____________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$####¶¶
      ______________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$¶¶#¶¶
      ______________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$$$¶¶
      ________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$$¶¶
      ________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$$$¶¶
      __________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$¶¶$$$$$$$$$$¶¶
      __________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##¶¶$$$$$$$$$$¶¶
      ____________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##¶¶$$$$$$$$888¶¶
      ____________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$######¶¶$$88888888¶¶
      ______________________¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$######¶¶¶¶888833333¶¶¶
      ______________________¶¶$$88$$$$$$$$$$$$$$$$$$$$$$$$$$####¶¶__¶¶88333333333¶¶
      ________________________¶¶$$88$$$$$$$$$$$$$$$$$$$$$$######¶¶____¶¶8833333333¶¶
      ________________________¶¶88$$88$$$$$$$$$$$$$$$$$$$$####¶¶______¶¶88833333338¶¶
      __________________________¶¶88$$88$$$$$$$$$$$$$$$$$$####¶¶________¶¶888333338¶¶
      __________________________¶¶$$88$$$$$$$$$$$$$$$$$$$$####¶¶__________¶¶$$$$$$¶¶
      ____________________________¶¶$$88$$$$$$$$$$$$$$$$$$¶¶¶¶¶¶¶¶¶¶________¶¶¶¶¶¶¶
      ____________________________¶¶88$$$$$$$$$$$$$$$$$$¶¶88333388$$¶¶
      ____________________________¶¶$$$$$$$$$$$$$$$$$$$$$$88333388$$$$¶¶¶¶____________¶¶¶¶¶¶¶¶¶¶¶
      ___________________________¶¶¶$$$$$$$$$$$$$$$$$$$$$$$$888888$$$$¶¶¥¥¶¶¶¶¶¶¶¶¶¶¶¶____§§§§§§¶¶¶¶
      ______________________¶¶¶¶¶¶¶$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$##¶¶§§§§§§§§§§§§§§§§§§______§§§§¶¶
      __________________¶¶¶¶333388$$$$$$$$$$$$$$$$########$$$$$$$$####¶¶¶¶§§§§§§§§§§§§§§____§§____§§§§¶¶
      ________________¶¶$$88333388$$$$$$$$############################¶¶##¶¶¶¶¶¶§§§§§§§§§§______§§§§§§¶¶
      ________________¶¶$$$$8888$$$$$$####################¶¶########¶¶####¶¶____¶¶¶¶¶¶§§§§§§§§§§§§§§§§¶¶
      ________________¶¶$$$$$$$$$$$$######¶¶################¶¶¶¶¶¶¶¶######¶¶__________¶¶¶¶§§§§§§§§¶¶¶¶
      ________________¶¶$$$$$$$$########¶¶####¶¶¶¶¶¶¶¶¶¶¶¶¶¶##############¶¶______________¶¶¶¶¶¶¶¶
      __________________¶¶##########¶¶¶¶¶¶¶¶¶¶______________¶¶¶¶########¶¶
      ____________________¶¶¶¶¶¶¶¶¶¶____________________________¶¶¶¶¶¶¶¶
      """;
   System.out.print(blockWobbu);
   return blockWobbu;
  }
  static String block8() {
  //Legends badge
  String blockbadge =
  """
                / \\  
               /   \\   
              /     \\ 
             /       \\ 
            /_________\\
            \\ L E G E /
             \\ N D S /
              \\     /
               \\   /
                \\ /

  """;
  System.out.print(blockbadge);
  return blockbadge;
  }
   
   //Story Typewriter
   static void Type(int num) throws InterruptedException{
      String[] array = {
      //Set of Texts in a Typewriter Array
      //1
         "Hi! Sorry to keep you waiting! \nWelcome to the world of Pokemon! \nMy name is Oak, \nBut people often call me PROFESSOR, \nProfessor Oak: This is a type of Pokemon!!", 
      //2
         "\n\nProfessor Oak: In this world, There are creatures called \"POKEMON\"\nProfessor Oak: We humans and POKEMON live in harmony, some as partners in Battles and others as friends\nProfessor Oak: Not everyone thinks and acts this way, but studies have shown that POKEMON and humans can share a Powerful Bond.!\nProfessor Oak: There are many new Pokemon to be disovered and cataloged, and, many secrets surrounding rare Pokemon that elude science.\nProfessor Oak: To unravel these mysteries, \nProfessor Oak: I have been doing research on them.",
      //3
         ", from YELLOW TOWN, We're neighbors!!! \nProfessor Oak: Now's when your adventure begins \nProfessor Oak: You will meet many friends and enemies \nProfessor Oak: But you must have the courage to maintain your friendship with your POKEMON and continue to grow. \nProfessor Oak: Well, the time has come, I have good news for you kid!\n",
      //4
         "\nGreetings to you Alain, \"The World Champion of Kalos Region\" \n\n\n              The League has been admiring your strength as a Pokemon Champion and seen you unleash your full potential with your Pokemons in battles \n\n\n                        With these, In behalf of the World Pokemon League, We are inviting you to the First \n\n\n                                           ", 
      //5
         "***Pokemon Legends League***",
      //6
         "\n\n\n                        In which, all Pokemon Champions are gathered in one big stadium and let them showcase there mastery of Pokemons \n\n\n              You are also acknowledged for your skills to join this league, but if you refuse you can invite other trainer you think has the potential to be a Pokemon Legend \n\n\n-\"Suecra\" Pokemon Legend.\n",
      //7
         "\n\nProfessor Oak: This letter from the Pokemon League was meant for Alain, The Champion of Kalos League. \nProfessor Oak: He was the one with the Mega Charizard X and fought in the Kalos League before but, Unluckily, \nProfessor Oak: He was heavily injured and is recovering when he encountered Team Plasma last week!. \nProfessor Oak: On the other hand, Alain, gave me permission to give this letter to someone I know who has the capability to win the League!. \nProfessor Oak: That is why kid!, I want you to join the World Pokemon League as substitute for Alain! \nProfessor Oak: I can see your potential and I have this feeling that you'll do great in this League!!! \nSo...\n\n",
      //8
         "\nProfessor Oak: It is a very wise decision from you kid, You will meet friends and enemies in your path! \nProfessor Oak: Now that you have decided to enter the league, You need prepare to yourself and your Pokemons for the upcoming battles! \nProfessor Oak: You need to assemble your greatest Pokemon Team! \nProfessor Oak: Here are the Pokemons, You can assemble Kid... \n\n" ,
      //9
         "\nProfessor Oak: With these, You are finally ready to compete in the much awaited \"Pokemon Legends League\", \nProfessor Oak: In which real battle from the Strongest Pokemon Leaders or Pokemon Trainers awaits You!. \nProfessor Oak: I know you can do it kid!!! \nProfessor Oak: Now is the time you go!, Chase that journey of yours!!! \nProfessor Oak: Wishing you a Goodluck to this Pokemon League, ", 
      //10
         "\n! ! ! ! ! ! \n\"THE START OF POKEMON LEGENDS LEAGUE\" \n\n\nPokemon League Host: Welcome, Pokemon Trainers, Pokemons, Pokemon Gym Leaders, and Audiences around the world!!! \nPokemon Host: This is, The \"The World Pokemon Legends League\" \nPokemon Host: In this League, It is a battle to see who's the Strongest among all Strongest!, Do you agree with that wobu??!\n\n",
      //11
         "\nWobbuffet: Wobbo-Wobbo -- WOBBUUUUFFFFFEEEEETTTT!!! \nPokemon Host: It looks like Wobbu also agrees!:) \nPokemon Host: and Now, Let us begin the ...!!! \nWobbuffet: Wobbuffeett!!! \nPokemon Host: The \"The World Pokemon Legends League\" \n",
      //12
         "\n\nPokemon Host: Ladies and Gentlemen, Pokemon and the World!!! \nPokemon Host: These are the Pokemon Champions and Pokemon Masters from all Regions Competing in this Tournament! \nPokemon Host: Allow me to present them one by one, \nPokemon Host: Starting with ..!!! \n\n\nPokemon Host: The Champion of Alola Region !!! Champion Ash Ketchum with his Pikachu! \nAsh: Let's win this Pikachu! \nPikachu: Pikaa - Pika - Pikaaaa! \n\nPokemon Host: The Champion of Hoenn Region !!! Champion Steven Stone with his Metagross! \nSteven: Let's Go Metagross! \nMetagross: Muuuuiiiiitooooo! \n\nPokemon Host: The Champion of Sinnoh Region !!! Champion Cynthia with her Garchomp! \nCynthia: I shall defeat you with all my might, Let's Go Garchomp! \nGarchomp: Aghhhhh - Grrrrr! \n\nPokemon Host: The Champion of Kalos Region !!! Champion Diantha with her Gardevoir! \nDiantha: We'll do our best Gardevoir! \nGardevoir: Gardeee - voirrr! \n\nPokemon Host: The Champion of Galar Region !!! Champion Leon with his Charizard! \nLeon: Its Champion Time! \nCharizard: Roaarrrrr! \n\nPokemon Host: The Champion of Indigo Plateau !!! Champion Lance with his Dragonite! \nLance: It looks like we need to be serious Dragonite! \nDragonite: Harrooo - oohhh! \n\nPokemon Host: The Champion of Unova Region !!! Champion Iris with his Haxorus! \nIris: We can win this together Haxorus! \nHaxorus: Haxxx - Haxxx! \n\nPokemon Host: The Former Champion of Unova Region !!! Champion Alder with his Boufallant! \nAlder: We might be old but were not gonna lose! \nBoufallant: Husssh - hussssh! \n\nPokemon Host: The Current Champion of Hoenn Region !!! Champion Wallace with his Milotic! \nWallace: Were gonna win this one in a flashyy way Milotic! \nMilotic: Woshhh - Woshh! \n\nPokemon Host: The Strongest Trainer in Sinnoh Region !!! Trainer Tobias with his Darkrai! \nTobias: As always Darkrai, WIN! \nDarkrai: Shhhh! \n\nPokemon Host: Also, The Strongest Trainer in Sinnoh Region !!! Trainer Paul with his Electrivire! \nPaul: Let's Enjoy and Finish this Electrivire! \nElectrivire: Sskkkssss - Skkkssss! \n\nPokemon Host: The Strongest Gym Leader in Galar Region !!! Gym Leader Raihan with his Goodra! \nRaihan: Yes! Yes were here, here to win this one, Ohhh Yeahhhh! \nGoodra: Gora - gora! \n\nPokemon Host: The Champion of Kanto Region !!! Champion Blue with his Alakazam! \nBlue: Let's defeat this all strong trainers here Alakazam! \nAlakazam: Yoshh- Yosh! \n\nPokemon Host: The Strongest Fire User in Sinnoh Region !!! Trainer Flint with his Infernape! \nFlint: I'm burning with passion now Infernape! \nInfernape: Infer - napeeee! \n\nPokemon Host: Wait! This one is very scary! but he is joining this League! The leader of Team Rocket !!! Leader Mr. Giovanni with his Persian! \nGiovanni: It's a matter of time before we can conquer the would Persian! \nPersian: Grrrrrr - grrrrr! \n\nPokemon Host: Also, This one is a familiar villain from before! The leader of Team Flare !!! Leader Mr. Lysandre with his Pyroar! \nLysandre: I'm gonna seek revenge on the World, MARK MY WORDS, GRENINJA!!! \nPyroar: Pyyyyy - Roarrrrrr! \n\nPokemon Host: And wait Everbody!, The Dark Horse of this Tournament, Substituting Champion Alain from Kalos, A Phenomenal Rookie in Yellow Town !!!" , 
      //13
         "\n\n\nPokemon Host: Now that all participating Pokemon Masters and Champions are introduced, \nPokemon Host: It is time to begin the Pokemon Battles!!! Pokemon Host: These are the Battle Matchups for this World Pokemon League! \n\nQuarterFinals Round: ",
      //14   
         "\n\nPokemon Host: Therefore, You are the Current World Champion of all Champions in all regions!!! \nPokemon Host: Congratulations Champ!!! \nWobuffet: Wooo-buuu--ffett!!!\n\n",
      //15
         "\nPokemon Host: Even Wobuffet is happy and glad towards your journey in this Pokemon League!!! \nPokemon Host: I myself is amazed on how tough and hard you experienced in this Pokemon Tournament, \nPokemon Host: We, The World, all saw how connected you are with your Pokemons! \nPokemon Host: Now, We give you the ... \n\n\n\"[*][+][*]Legends Badge[*][+][*]!\n\n", 
      //16   
         "\nThis badge symbolizes how tough you are and how bonded you are with your Pokemons \n\n\nPokemon Host: Now, Champion, and the World!!!, \nPokemon Host: It is your time! to face the real battle! of! \"Pokemon\"!!! \nPokemon Host: I am your Pokemon Host for the World Pokemon Tournament and!!! \nUnknown Entity!: I was the one who initiated this Tournament, \nPokemon Host / Entity: I am your host, and the one who sent the letters!, Everybody!, I am !!!!! \n\n\n \"[*][+][*]ARCEUS[*][+][*]!!!\n\n\n", 
      //17 
         "\n\"-Arceus: Said to be The Strongest Pokemon and Creator of all Beings!!!\"\n\nPokemon Host / Unknown Entity / Arceus: The letter you all received has a signature to a certain person named: \"SUECRA\" who initiated the Tournament, \nArceus: and that is me \"ARCEUS\"! \nArceus: Now, Champion, You have proven that you are the Strongest in the World! \nArceus: You have the chance to fight me and even defeat me! Right here and right now! \nArceus: Therefore, I challenge you into a Pokemon battle!!!\n",
      //18
         "\n\n\n\n=================================================================================================================\nArceus: You really are the Strongest Pokemon Trainer in the whole World! \n\nArceus: You have proven your strength as a Trainer and your bond, with your Pokemons is very deep! \n\nArceus: I am amazed in you Champion!, You are befitting with the Title of \"The Strongest\" \n\nArceus: You have defeated the Strongest Pokemon and Their Creator \n\nArceus: Honestly, I've been looking forward to this World Pokemon Tournament \n\nArceus: I have been bored and sick of all the Godly Stuffs as a Pokemon Creator in the Space-Time-Dimension \n\nArceus: I also, would want to experience \"Bond\" \n\nArceus: And How it feels to fight alongside with someone \n\nArceus: As I have witnessed the battles, your battles, and my battles, I have realized, \n\nArceus: That what I have been doing this centuries are really worth it, \n\nArceus: This it the fruit of my Hardworks, \n\nArceus: \"Bond\" \n\nArceus: Perfect Bond Between Pokemons and Humans!!! \n\nArceus: Thank You for making me experience this Champion!, I really appreciate it and \n\nArceus: I need to go back now to the Space-Time-Dimension\n \n\nArceus: You can have me as your Pokemon in your Run Again in this Game \n\nArceus: Audience, People, Pokemon, World!!! The Perfect Bond with Pokemon and Humans is \n\nArceus: A Step of Change, Change that Will Unite our Species, One Day!!!! \n\nArceus: *Teleports Back to the Space-Time-Dimension!\n\n",
      //19
         "\n\n*You have acquired \"Arceus\" in your Pokemon Register* \n\n\n\nYou can use him in your next Run in this Game! \n\n\n\n\n\nCredits: \n*Pokemon Legends Creator/Developer!: Delgado, Kent Paulo R. \n*Story based on ScreenPlay by!: Delgado, Kent Paulo R. \n\n\nPokemon Legends MiniFanMade-Java Game 2023\n\n"
      };
      for (int i = 0; i < array[num].length(); i++){   
         Thread.sleep(10);
            System.out.print(array[num].charAt(i));
               if (array[num].charAt(i) == ',') {
                  Thread.sleep(800);
      } 
               else if (array[num].charAt(i) == '!') {
                  Thread.sleep(1000);
      } 
               else if (array[num].contains("***Pokemon Legends League***")){
                  Thread.sleep(5);
         }
      }
   } 
//VS LYSANDRE BATTLE VARIABLES
      static int again = 0;
      static int Pokemonmove;
      static int non = 0, change = 0, stat = 0, cam = 0;
      static boolean found = false;
      static String count = "";
      static char choose = ' ';
      static int enemyrandompoke = 0, action;
      static String enemy = "Lysandre";
      static String ElemPoke;
      static String pick;
      static String [] pokemonarray = new String [1000];
      static String [] pokemonElement = new String [1000];
      static boolean PokeOut = true;
      static boolean PokeOutE = true;
      static boolean Win = true;
   
   // Player Stats
      static int choice=0, move, a=0, hitrate, playerhp = 0;
      static int[] damage = {0, 15, 20, 25};
      static int[] accuracy = {0, 80, 70, 60};
   // Enemy Stats
      static int enemyhp = 0, enemymove, enemyhitrate, enemyattack, enemyhealchance;
      static int[] enemydamage = {5, 10, 15};
      static int[] enemyaccuracy = {60, 70, 80};
      
      static int playerIndex = -1;
      static int enemyIndex = -1;

   // Pokémon types and Lysandre's Pokemons  
      static int [] healtharray = {50, 50, 50, 50, 50, 50};       
      static String [] earray = { "Pyroar", "Blaziken", "Salamence", "Emboar", "Volcarona", "Steelix" };     
      static int [] healthearray = {50, 50, 50, 50, 50, 50};     
      static String [] earray2 = { "Fire", "Fire", "Dragon", "Fire", "Fire", "Steel" };     
      static String[] ElementsArray = {
            "Normal", "Fire", "Water", "Grass", "Electric", "Ice", "Fighting",
            "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost",
            "Dark", "Dragon", "Steel", "Fairy"
        };
      static String[][] movesForElements = {
            {"Tackle", "Scratch", "Hyper Beam"}, // Normal
            {"Ember", "Fire Blast", "Flamethrower"}, // Fire
            {"Water Gun", "Surf", "Hydro Pump"}, // Water
            {"Razor Leaf", "Solar Beam", "Vine Whip"}, // Grass
            {"Thunderbolt", "Thunder Shock", "Thunder Wave"}, // Electric
            {"Ice Beam", "Avalanche", "Blizzard"}, // Ice
            {"Karate Chop", "Dynamic Punch", "Close Combat"}, // Fighting
            {"Poison Sting", "Toxic", "Sludge Bomb"}, // Poison
            {"Earthquake", "Dig", "Sand Tomb"}, // Ground
            {"Fly", "Aerial Ace", "Brave Bird"}, // Flying
            {"Psybeam", "Psychic", "Future Sight"}, // Psychic
            {"Bug Bite", "X-Scissor", "Bug Buzz"}, // Bug
            {"Rock Slide", "Stone Edge", "Rock Tomb"}, // Rock
            {"Shadow Claw", "Shadow Ball", "Night Shade"}, // Ghost
            {"Dark Pulse", "Foul Play", "Night Slash"}, // Dark
            {"Dragon Breath", "Dragon Claw", "Dragon Pulse"}, // Dragon
            {"Iron Tail", "Metal Claw", "Flash Cannon"}, // Steel
            {"Fairy Wind", "Moonblast", "Dazzling Gleam"}, // Fairy
            {"Trinity Nova", "StarBirth", "Judgement"}
        };  
//VS CYNTHIA BATTLE VARIABLES
   public static void resetVariables(String[] array, String[] array2, String names) {
    again = 0;
    Pokemonmove = 0;
    non = 0;
    change = 0;
    stat = 0;
    cam = 0;
    found = false;
    count = "";
    choose = ' ';
    enemyrandompoke = 0;
    action = 0;
    enemy = "Cynthia";
    ElemPoke = "";
    pick = "";
    pokemonarray = new String[1000];
    pokemonElement = new String[1000];
    PokeOut = true;
    PokeOutE = true;
    Win = true;

    // Reset Player Stats
    choice = 0;
    move = 0;
    a = 0;
    hitrate = 0;
    playerhp = 0;
    damage = new int[]{0, 15, 20, 25};
    accuracy = new int[]{0, 80, 70, 60};

    // Reset Enemy Stats
    enemyhp = 0;
    enemymove = 0;
    enemyhitrate = 0;
    enemyattack = 0;
    enemyhealchance = 0;
    enemydamage = new int[]{5, 10, 15};
    enemyaccuracy = new int[]{60, 70, 80};

    playerIndex = -1;
    enemyIndex = -1;

    // Reset Pokémon types and related arrays
    // Cynthia's Pokemon
    healtharray = new int[]{50, 50, 50, 50, 50, 50};
    earray = new String[]{"Garchomp", "Spiritomb", "Roserade", "Gastrodon", "Lucario", "Milotic"};
    healthearray = new int[]{50, 50, 50, 50, 50, 50};
    earray2 = new String[]{"Dragon", "Fire", "Grass", "Water", "Fighting", "Water"};
}  
//VS TOBIAS BATTLE VARIABLES
   public static void resetVariables2(String[] array, String[] array2, String names) {
    again = 0;
    Pokemonmove = 0;
    non = 0;
    change = 0;
    stat = 0;
    cam = 0;
    found = false;
    count = "";
    choose = ' ';
    enemyrandompoke = 0;
    action = 0;
    enemy = "Tobias";
    ElemPoke = "";
    pick = "";
    pokemonarray = new String[1000];
    pokemonElement = new String[1000];
    PokeOut = true;
    PokeOutE = true;
    Win = true;

    // Reset Player Stats
    choice = 0;
    move = 0;
    a = 0;
    hitrate = 0;
    playerhp = 0;
    damage = new int[]{0, 15, 20, 25};
    accuracy = new int[]{0, 80, 70, 60};

    // Reset Enemy Stats
    enemyhp = 0;
    enemymove = 0;
    enemyhitrate = 0;
    enemyattack = 0;
    enemyhealchance = 0;
    enemydamage = new int[]{5, 10, 15};
    enemyaccuracy = new int[]{60, 70, 80};

    playerIndex = -1;
    enemyIndex = -1;

    // Reset Pokémon types and related arrays
    //Tobias' Pokemon
    healtharray = new int[]{50, 50, 50, 50, 50, 50};
    earray = new String[]{"Darkrai", "Latios", "Dragonite", "Salamence", "Garchomp", "Latias"};
    healthearray = new int[]{50, 50, 50, 50, 50, 50};
    earray2 = new String[]{"Dark", "Psychic", "Dragon", "Dragon", "Dragon", "Psychic"};
}  
//VS ASH BATTLE VARIABLES
   public static void resetVariables3(String[] array, String[] array2, String names) {
    again = 0;
    Pokemonmove = 0;
    non = 0;
    change = 0;
    stat = 0;
    cam = 0;
    found = false;
    count = "";
    choose = ' ';
    enemyrandompoke = 0;
    action = 0;
    enemy = "Ash";
    ElemPoke = "";
    pick = "";
    pokemonarray = new String[1000];
    pokemonElement = new String[1000];
    PokeOut = true;
    PokeOutE = true;
    Win = true;

    // Reset Player Stats
    choice = 0;
    move = 0;
    a = 0;
    hitrate = 0;
    playerhp = 0;
    damage = new int[]{0, 15, 20, 25};
    accuracy = new int[]{0, 80, 70, 60};

    // Reset Enemy Stats
    enemyhp = 0;
    enemymove = 0;
    enemyhitrate = 0;
    enemyattack = 0;
    enemyhealchance = 0;
    enemydamage = new int[]{5, 10, 15};
    enemyaccuracy = new int[]{60, 70, 80};

    playerIndex = -1;
    enemyIndex = -1;

    // Reset Pokémon types and related arrays
    //Ash' Pokemon
    healtharray = new int[]{50, 50, 50, 50, 50, 50};
    earray = new String[]{"Pikachu", "Charizard", "Greninja", "Infernape", "Krookodile", "Sceptile"};
    healthearray = new int[]{50, 50, 50, 50, 50, 50};
    earray2 = new String[]{"Electric", "Fire", "Water", "Fire", "Ground", "Grass"};
} 
//BACK UP VS LYSANDRE BATTLE VARIABLES
   public static void resetVariables5(String[] array, String[] array2, String names) {
    again = 0;
    Pokemonmove = 0;
    non = 0;
    change = 0;
    stat = 0;
    cam = 0;
    found = false;
    count = "";
    choose = ' ';
    enemyrandompoke = 0;
    action = 0;
    enemy = "Lysandre";
    ElemPoke = "";
    pick = "";
    pokemonarray = new String[1000];
    pokemonElement = new String[1000];
    PokeOut = true;
    PokeOutE = true;
    Win = true;

    // Reset Player Stats
    choice = 0;
    move = 0;
    a = 0;
    hitrate = 0;
    playerhp = 0;
    damage = new int[]{0, 15, 20, 25};
    accuracy = new int[]{0, 80, 70, 60};

    // Reset Enemy Stats
    enemyhp = 0;
    enemymove = 0;
    enemyhitrate = 0;
    enemyattack = 0;
    enemyhealchance = 0;
    enemydamage = new int[]{5, 10, 15};
    enemyaccuracy = new int[]{60, 70, 80};

    playerIndex = -1;
    enemyIndex = -1;

    // Reset Pokémon types and related arrays
    //Lysandre's Pokemon
    healtharray = new int[]{50, 50, 50, 50, 50, 50};
    earray = new String[]{"Pyroar", "Blaziken", "Salamence", "Emboar", "Volcarona", "Steelix"};
    healthearray = new int[]{50, 50, 50, 50, 50, 50};
    earray2 = new String[]{"Fire", "Fire", "Dragon", "Fire", "Fire", "Steel"};
}  
//FINAL VS ARCEUS BATTLE VARIABLES
   public static void resetVariables4(String[] array, String[] array2, String names) {
    again = 0;
    Pokemonmove = 0;
    non = 0;
    change = 0;
    stat = 0;
    cam = 0;
    found = false;
    count = "";
    choose = ' ';
    enemyrandompoke = 0;
    action = 0;
    enemy = "Arceus";
    ElemPoke = "";
    pick = "";
    pokemonarray = new String[1000];
    pokemonElement = new String[1000];
    PokeOut = true;
    PokeOutE = true;
    Win = true;

    // Reset Player Stats
    choice = 0;
    move = 0;
    a = 0;
    hitrate = 0;
    playerhp = 0;
    damage = new int[]{0, 15, 20, 25};
    accuracy = new int[]{0, 80, 70, 60};

    // Reset Enemy Stats
    enemyhp = 0;
    enemymove = 0;
    enemyhitrate = 0;
    enemyattack = 0;
    enemyhealchance = 0;
    enemydamage = new int[]{15, 20, 25};
    enemyaccuracy = new int[]{80, 70, 60};

    playerIndex = -1;
    enemyIndex = -1;

    // Reset Pokémon types and related arrays
    //Arceus' Pokemon
    healtharray = new int[]{50, 50, 50, 50, 50, 50};
    earray = new String[]{"Arceus-Fire", "Arceus-Water", "Arceus-Fairy", "Arceus-Steel", "Arceus-Psychic", "Arceus-Dark"};
    healthearray = new int[]{50, 50, 50, 50, 50, 50};
    earray2 = new String[]{"Fire", "Water", "Fairy", "Steel", "Psychic", "Dark"};
}  

//FOR TOURNAMENT OPENING
   public static void OpeningMarks(String[] array, String[] array2, String names) {
   //Opening Message
      System.out.print("\n=================================================================================================================\nWelcome to the World Pokemon League!!! \nPokemon Battle Starts Now!!!\n\n");
   //Shows the user's chosen Pokemon
      System.out.println(names + "'s Pokemon Deck: ");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "[" + healtharray[i] + "hp]" + " "); 
      }
   //Shows the opponent's default Pokemon
      System.out.println("\n\n" + enemy + "'s Pokemons");
         for (int i = 0; i < earray.length; i++) {
            System.out.print(earray[i] + "[" + healthearray[i] + "hp]" + " ");
      }
   }
   
//FOR FINAL BATTLE VS ARCEUS OPENING
   public static void OpeningMarks2(String[] array, String[] array2, String names) {
   //Opening Message
      System.out.print("\n=================================================================================================================\nWelcome to the Final Stage of World Pokemon League!!! \nPokemon Battle Starts Now VS Pokemon God Arceus!!!\n\n");
   //Shows the user's chosen Pokemon
      System.out.println(names + "'s Pokemon Deck: ");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "[" + healtharray[i] + "hp]" + " "); 
      }
   //Shows the opponent's default Pokemon
      System.out.println("\n\n" + enemy + "'s Pokemons");
         for (int i = 0; i < earray.length; i++) {
            System.out.print(earray[i] + "[" + healthearray[i] + "hp]" + " ");
      }
   }
//FOR TOURNAMENT BATTLE METHOD
   //STARTS BATTLE
   public static void BattleStart(String[] array, String[] array2, String names) {
   Scanner input = new Scanner (System.in);
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();

 do {    
    a = 1;
    pick = "";
    cam = 0;
    PokeOut = false;
    PokeOutE = false;
    Win = false;
      do {
            //Lets user choose Pokemons in his/her battle
            System.out.print("\n\nChoose your Pokemon for the Battle: \n");
               for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]" + " ");
      }
            System.out.print("\n> ");
               pick = scanner.nextLine();
               //input music
                  inputPoke();
                 
            // Check if the user's choice matches any Pokémon in the array
            for (int i = 0; i < array.length; i++) {
               stat = i;
                  if (array[i].equalsIgnoreCase(pick)) {
                     System.out.println("\nYou've chosen: " + array[i]);
                     found = true;
                     pokemonarray[stat] = array[i]; 
                     count = array2[i];
                     playerhp = healtharray[i];
                     a = 0;
                     if (playerhp <= 0){
                  System.out.print("\nPokemon Fainted!!!!, Choose another Pokemon!!!!!!!");
                  a = 1;
                  }
                  break;
           }
      }
                  // If user chooses pokemon/words beyond the array, it inputs invalid!
                  if (!found) {
                     System.out.println("Invalid Pokémon choice!");
                     a = 1;
      }
    } while(a == 1);  // returns if value is equal to 1
    
        // Generating a random index/Pokemon for opponent   
     do {
        enemyrandompoke = random.nextInt(earray.length);
          }while (healthearray[enemyrandompoke] <= 0); //returns if the random value is <= to 0, it wont settle unless the Pokemon has a health > 0 
                  
            String opponentPokemon = earray[enemyrandompoke];
            enemyhp = healthearray[enemyrandompoke];
         
        // Selecting opponent's Pokémon and type using the random index
        // Displaying the opponent's choice
        System.out.println(enemyhp);
        System.out.println("Opponent's Choice: " + opponentPokemon + "\n\n-------------------");      
      
    
   //Start of the Game
   do {
      //Enemy Healtbar denoted as "X" in full, "-" Less Health
      System.out.print(opponentPokemon + ":[");
        for(int i = 1; i <= 50; i++) {
            i+=4;
               if(i <= enemyhp) {
                  System.out.print("X");
            }  
               else {
                  System.out.print("-");
            } 
         }
         System.out.println("]");
      //User's Healthbar denoted as "=" in full, "-" Less Health
         System.out.print(pokemonarray[stat] + ":[");
         for(int i = 1; i <= 50; i++) {
            i+=4;
            if(i <= playerhp) {
               System.out.print("=");
            }
            else {
               System.out.print("-");
            }
         }
         System.out.println("]");
      // User's Ingame Options
         System.out.println("Choose an action:");
         System.out.println("[1] Attack \n[2] Potion \n[3] Run \n-------------------");
         System.out.print("> ");
            action = scanner.nextInt();

      //input music
      inputPoke();
         
     if (action == 1) {
       //List of Pokemon Moves / elements
         switch(count) {
         case "Normal": System.out.print("[1]Tackle \n[2]Scratch \n[3]Hyper Beam");
            break; 
         case "Fire": System.out.print("[1]Ember \n[2]Fire Blast \n[3]Flamethrower");
            break; 
         case "Water": System.out.print("[1]Water Gun \n[2]Surf \n[3]Hydro Pump");
            break;
         case "Grass": System.out.print("[1]Razor Leaf \n[2]Solar Beam \n[3]Vine Whip");
            break;
         case "Electric": System.out.print("[1]Thunderbolt \n[2]Thunder Shock \n[3]Thunder Wave");
            break;
         case "Ice": System.out.print("[1]Ice Beam \n[2]Avalanche \n[3]Blizzard");
            break;
         case "Fighting": System.out.print("[1]Karate Chop \n[2]Dynamic Punch \n[3]Close Combat");
            break; 
         case "Poison": System.out.print("[1]Poison Sting \n[2]Toxic \n[3]Sludge Bomb");
            break;
         case "Ground": System.out.print("[1]Earthquake \n[2]Dig \n[3]Sand Tomb");
            break;
         case "Flying": System.out.print("[1]Fly \n[2]Aerial Ace \n[3]Brave Bird");
            break;
         case "Psychic": System.out.print("[1]Psybeam \n[2]Psychic \n[3]Future Sight");
            break;
         case "Bug": System.out.print("[1]Bug Bite \n[2]X-Scissor \n[3]Bug Buzz");
            break;
         case "Rock": System.out.print("[1]Rock Slide \n[2]Stone Edge \n[3]Rock Tomb");
            break;
         case "Ghost": System.out.print("[1]Shadow Claw \n[2]Shadow Ball \n[3]Night Shade");
            break;
         case "Dragon": System.out.print("[1]Dragon Breath \n[2]Dragon Claw \n[3]Dragon Pulse");
            break;
         case "Dark": System.out.print("[1]Dark Pulse \n[2]Foul Play \n[3]Night Slash");
            break;
         case "Steel": System.out.print("[1]Iron Tail \n[2]Metal Claw \n[3]Flash Cannon");
            break;
         case "Fairy": System.out.print("[1]Fairy Wind \n[2]Moonblast \n[3]Dazzling Gleam");
            break;
         case "Rainbow" : System.out.print("[1]Trinity Nova \n[2]StarBirth \n[3]Judgement");
            break;
         default : System.out.print("Invalid Pokemon Move");
           }
         System.out.print("\nChoose your move: ");
               Pokemonmove = scanner.nextInt();
        //input music
         inputPoke();
     
            if (Pokemonmove < 1 || Pokemonmove > 3) {
               System.out.println("Invalid move choice!");
        } 
            else {
            // Randomization of Pokemon Hitrate
               hitrate = random.nextInt(101);
                  if (hitrate >= accuracy[Pokemonmove]) {
                     System.out.println("\nYour attack missed!\n");
            } 
                  else {
                     System.out.println("\nYou hit your attack!");
                        enemyhp -= damage[Pokemonmove];
                     System.out.println("You dealt " + damage[Pokemonmove] + " damage!\n");
               }   
            }
         }
     // Potions
       if(action == 2) {
          System.out.println("You consumed a potion!");
             if(playerhp < 50) {
                playerhp += 10;
                  System.out.println("Healed 10 HP!");
                     if(playerhp > 50) {
                        playerhp = 50;
               }
            }
             else if(playerhp == 50) {
               System.out.println("HP is already full! The potion didn't do anything!");
            }
         }
     //Running from Tournament
        if(action == 3) {
            System.out.println("Can't Run from this World Pokemon Tournament!!!");
               a = 0;
               }   
     //Wrong Input out of the 3 choices
        else if (action < 0 || action > 3) {
         System.out.print("Invalid Input, Not in the options presented!\n");
        }         
    //Enemy Methods
       //Randomization of Attacks
       System.out.println("Enemy " + enemy + " turn: ");
            enemymove = random.nextInt(1, 11);
            enemyhitrate = random.nextInt(1, 101);
            enemyattack = random.nextInt(1, 4);

            if (enemyhitrate <= enemyaccuracy[enemyattack - 1]) { //-1 because enemyattack starts at index 1
                if (enemyattack <= 2) {
                    playerhp -= enemydamage[1]; // Deduct damage from player's health
                    System.out.println("Enemy dealt " + enemydamage[1] + " damage!\n");
                } 
                else if (enemyattack == 3 && playerhp > 25) {
                    playerhp -= enemydamage[2]; // Deduct damage from player's health
                    System.out.println("Enemy dealt " + enemydamage[2] + " damage!\n");
                }
            } 
            else if ((enemyhitrate > enemyaccuracy[enemyattack - 1]) && playerhp > 25) { // ensures that the player's Pokémon has sufficient health (greater than 25) to endure the attack even if it lands. It's an additional check to confirm that the player's Pokémon can take damage.
                System.out.println("Enemy's attack missed!\n");
            } 
            
            for (int i = 0; i < healtharray.length; i++){
               if (pokemonarray[stat] == array[i]) {  
                  playerIndex = i; //Stores the index of the pokemon
                  break;
               }
           }
              if (playerIndex != -1) {
                 healtharray[playerIndex] = playerhp; //Updates the health of the Pokemon in healtharray
         }
         
         //   If Pokemon hp = 0, it will show in the screen board 0hp
              if (playerhp <= 0){
               playerhp = 0;
               healtharray[playerIndex] = playerhp;
         }
              else {
              healtharray[playerIndex] = playerhp;
         }//
         
         //   If Pokemon hp = 0, it will show in the screen board 0hp
              if(enemyhp <= 0){
                 enemyhp = 0;
                     healthearray[enemyrandompoke] = enemyhp; //Updates the health of the Pokemon in healthearray
         } 
              else {
                  healthearray[enemyrandompoke] = enemyhp;
         }
         non++;
         
      } while(playerhp > 0 && enemyhp > 0); //returns if the HP is not yet less than 0, or Pokemon not fainted
  
  //Declaration of Winners
      if(playerhp <= 0) {
         System.out.println("\nYou were defeated!");
         
      }
      else if(enemyhp <= 0) {
         System.out.println("\nYou won! " + pokemonarray[stat] + " defeated " + opponentPokemon);
      }
  //INputting Again       
  do {    
      System.out.print("Do you want to change pokemons? (Please Input Again \"Yes or No\"): ");
         choose = input.next().charAt(0);
         //input music
         inputPoke();
            if (choose == 'y' || choose == 'Y') {
            a = 1;
            // Check if all opponent Pokémon have 0 HPs
                boolean allOpponentFainted = true;
                   for (int hp : healthearray) { //Check Healtharray
                      if (hp > 0) {
                        allOpponentFainted = false;
                        break;
            }
         }
            //Check if all user's Pokémon have 0 HPs
               boolean allFainted = true;
                   for (int enemyhp : healtharray) { //Check Healtharray
                      if (enemyhp > 0) {
                        allFainted = false;
                        break;
            }
         }
   //Winner
          if (allOpponentFainted) {
             System.out.println("\n\n\nYou've Won!!!!!, " + names + ", All of " + enemy + "'s Pokémon fainted!");
                 Exit(array, array2, names);
                 return; // Exit the loop as all opponent Pokémon fainted
                }
          else if (allFainted) {
             System.out.println("\n\n\nYou've Lost!!!!!, " + names + ", All of " + enemy + "'s Pokémon defeated you!");
                 ExitE(array, array2, names);
                 return; // Exit the loop as all player Pokémon fainted
                }
                
          //break continues here  
             pick = ""; // Resetting pick to an empty string to prompt for a new Pokémon choice
             
             System.out.println("\n" + names + "'s Pokemon Deck: ");
                 for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + "[" + healtharray[i] + "hp]" + " "); 
      }
             System.out.println("\n\n" + enemy + "'s Pokemons");
                 for (int i = 0; i < earray.length; i++) {
                    System.out.print(earray[i] + "[" + healthearray[i] + "hp]" + " ");
      } 
   }    
         else {
             System.out.println("Can't Say No, Please Input \"Yes\" Only!...");
                  a = 0;
              // Exit the loop or take appropriate action to end the game     
             }
         }while (a == 0);
 
      }while (non <= 6  || choose == 'Y' || choose == 'y'); 
    }
   //EXIT IS USER WINS
   public static void Exit(String[] array, String[] array2, String names) {
      if(!PokeOut) {
         System.out.print("\n" + names + ", You are Proceeding in the Finals Round!!!!!");
         Win = true;
         return;
      }
   }
   //EXIT IS ENEMY WINS
   public static void ExitE(String[] array, String[] array2, String names) {
      if(!PokeOutE) {
         System.out.print("\n" + names + ", You are not Qualified in the Finals Round!!!!!\nRepeating the Game until you Win!!!\n\n");
         Win = false;
         return;
      }
   }
//FOR FINAL BATTLE VS ARCEUS BATTLE METHOD
   //STARTS BATTLE WITH ARCEUS
   public static void BattleStart2(String[] array, String[] array2, String names) {
   Scanner input = new Scanner (System.in);
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();

 do {    
    a = 1;
    pick = "";
    cam = 0;
    PokeOut = false;
    PokeOutE = false;
    Win = false;
      do {
            //Lets user choose Pokemons in his/her battle
            System.out.print("\n\nChoose your Pokemon for the Battle: \n");
               for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]" + " ");
      }
            System.out.print("\n> ");
               pick = scanner.nextLine();
              //input music
               inputPoke();
                 
            // Check if the user's choice matches any Pokémon in the array
            for (int i = 0; i < array.length; i++) {
               stat = i;
                  if (array[i].equalsIgnoreCase(pick)) {
                     System.out.println("\nYou've chosen: " + array[i]);
                     found = true;
                     pokemonarray[stat] = array[i]; 
                     count = array2[i];
                     playerhp = healtharray[i];
                     a = 0;
                     if (playerhp <= 0){
                  System.out.print("\nPokemon Fainted!!!!, Choose another Pokemon!!!!!!!");
                  a = 1;
                  }
                  break;
           }
      }
                  // If user chooses pokemon/words beyond the array, it inputs invalid!
                  if (!found) {
                     System.out.println("Invalid Pokémon choice!");
                     a = 1;
      }
    } while(a == 1);  // returns if value is equal to 1
    
        // Generating a random index/Pokemon for opponent   
     do {
        enemyrandompoke = random.nextInt(earray.length);
          }while (healthearray[enemyrandompoke] <= 0); //returns if the random value is <= to 0, it wont settle unless the Pokemon has a health > 0 
                  
            String opponentPokemon = earray[enemyrandompoke];
            enemyhp = healthearray[enemyrandompoke];
         
        // Selecting opponent's Pokémon and type using the random index
        // Displaying the opponent's choice
        System.out.println(enemyhp);
        System.out.println("Opponent's Choice: " + opponentPokemon + "\n\n-------------------");      
      
    
   //Start of the Game
   do {
      //Enemy Healtbar denoted as "X" in full, "-" Less Health
      System.out.print(opponentPokemon + ":[");
        for(int i = 1; i <= 50; i++) {
            i+=4;
               if(i <= enemyhp) {
                  System.out.print("X");
            }  
               else {
                  System.out.print("-");
            } 
         }
         System.out.println("]");
      //User's Healthbar denoted as "=" in full, "-" Less Health
         System.out.print(pokemonarray[stat] + ":[");
         for(int i = 1; i <= 50; i++) {
            i+=4;
            if(i <= playerhp) {
               System.out.print("=");
            }
            else {
               System.out.print("-");
            }
         }
         System.out.println("]");
      // User's Ingame Options
         System.out.println("Choose an action:");
         System.out.println("[1] Attack \n[2] Potion \n[3] Run \n-------------------");
         System.out.print("> ");
            action = scanner.nextInt();
         //input music
         inputPoke();
         
     if (action == 1) {
       //List of Pokemon Moves / elements
         switch(count) {
         case "Normal": System.out.print("[1]Tackle \n[2]Scratch \n[3]Hyper Beam");
            break; 
         case "Fire": System.out.print("[1]Ember \n[2]Fire Blast \n[3]Flamethrower");
            break; 
         case "Water": System.out.print("[1]Water Gun \n[2]Surf \n[3]Hydro Pump");
            break;
         case "Grass": System.out.print("[1]Razor Leaf \n[2]Solar Beam \n[3]Vine Whip");
            break;
         case "Electric": System.out.print("[1]Thunderbolt \n[2]Thunder Shock \n[3]Thunder Wave");
            break;
         case "Ice": System.out.print("[1]Ice Beam \n[2]Avalanche \n[3]Blizzard");
            break;
         case "Fighting": System.out.print("[1]Karate Chop \n[2]Dynamic Punch \n[3]Close Combat");
            break; 
         case "Poison": System.out.print("[1]Poison Sting \n[2]Toxic \n[3]Sludge Bomb");
            break;
         case "Ground": System.out.print("[1]Earthquake \n[2]Dig \n[3]Sand Tomb");
            break;
         case "Flying": System.out.print("[1]Fly \n[2]Aerial Ace \n[3]Brave Bird");
            break;
         case "Psychic": System.out.print("[1]Psybeam \n[2]Psychic \n[3]Future Sight");
            break;
         case "Bug": System.out.print("[1]Bug Bite \n[2]X-Scissor \n[3]Bug Buzz");
            break;
         case "Rock": System.out.print("[1]Rock Slide \n[2]Stone Edge \n[3]Rock Tomb");
            break;
         case "Ghost": System.out.print("[1]Shadow Claw \n[2]Shadow Ball \n[3]Night Shade");
            break;
         case "Dragon": System.out.print("[1]Dragon Breath \n[2]Dragon Claw \n[3]Dragon Pulse");
            break;
         case "Dark": System.out.print("[1]Dark Pulse \n[2]Foul Play \n[3]Night Slash");
            break;
         case "Steel": System.out.print("[1]Iron Tail \n[2]Metal Claw \n[3]Flash Cannon");
            break;
         case "Fairy": System.out.print("[1]Fairy Wind \n[2]Moonblast \n[3]Dazzling Gleam");
            break;
         case "Rainbow" : System.out.print("[1]Trinity Nova \n[2]StarBirth \n[3]Judgement");
            break;
         default : System.out.print("Invalid Pokemon Move");
           }
         System.out.print("\nChoose your move: ");
               Pokemonmove = scanner.nextInt();
               //input music
               inputPoke();
     
            if (Pokemonmove < 1 || Pokemonmove > 3) {
               System.out.println("Invalid move choice!");
        } 
            else {
            // Randomization of Pokemon Hitrate
               hitrate = random.nextInt(101);
                  if (hitrate >= accuracy[Pokemonmove]) {
                     System.out.println("\nYour attack missed!\n");
            } 
                  else {
                     System.out.println("\nYou hit your attack!");
                        enemyhp -= damage[Pokemonmove];
                     System.out.println("You dealt " + damage[Pokemonmove] + " damage!\n");
               }   
            }
         }
     // Potions
       if(action == 2) {
          System.out.println("You consumed a potion!");
             if(playerhp < 50) {
                playerhp += 10;
                  System.out.println("Healed 10 HP!");
                     if(playerhp > 50) {
                        playerhp = 50;
               }
            }
             else if(playerhp == 50) {
               System.out.println("HP is already full! The potion didn't do anything!");
            }
         }
     //Running from Tournament
        if(action == 3) {
            System.out.println("Can't Run from this World Pokemon Tournament!!!");
               a = 0;
               }   
     //Wrong Input out of the 3 choices
        else if (action < 0 || action > 3) {
         System.out.print("Invalid Input, Not in the options presented!\n");
        }         
    //Enemy Methods
       //Randomization of Attacks
       System.out.println("Enemy " + enemy + " turn: ");
            enemymove = random.nextInt(1, 11);
            enemyhitrate = random.nextInt(1, 101);
            enemyattack = random.nextInt(1, 4);

            if (enemyhitrate <= enemyaccuracy[enemyattack - 1]) { //-1 because enemyattack starts at index 1
                if (enemyattack <= 2) {
                    playerhp -= enemydamage[1]; // Deduct damage from player's health
                    System.out.println("Enemy dealt " + enemydamage[1] + " damage!\n");
                } 
                else if (enemyattack == 3 && playerhp > 25) {
                    playerhp -= enemydamage[2]; // Deduct damage from player's health
                    System.out.println("Enemy dealt " + enemydamage[2] + " damage!\n");
                }
            } 
            else if ((enemyhitrate > enemyaccuracy[enemyattack - 1]) && playerhp > 25) { // ensures that the player's Pokémon has sufficient health (greater than 25) to endure the attack even if it lands. It's an additional check to confirm that the player's Pokémon can take damage.
                System.out.println("Enemy's attack missed!\n");
            } 
            
            for (int i = 0; i < healtharray.length; i++){
               if (pokemonarray[stat] == array[i]) {  
                  playerIndex = i; //Stores the index of the pokemon
                  break;
               }
           }
              if (playerIndex != -1) {
                 healtharray[playerIndex] = playerhp; //Updates the health of the Pokemon in healtharray
         }
         
         //   If Pokemon hp = 0, it will show in the screen board 0hp
              if (playerhp <= 0){
               playerhp = 0;
               healtharray[playerIndex] = playerhp;
         }
              else {
              healtharray[playerIndex] = playerhp;
         }//
         
         //   If Pokemon hp = 0, it will show in the screen board 0hp
              if(enemyhp <= 0){
                 enemyhp = 0;
                     healthearray[enemyrandompoke] = enemyhp; //Updates the health of the Pokemon in healthearray
         } 
              else {
                  healthearray[enemyrandompoke] = enemyhp;
         }
         non++;
         
      } while(playerhp > 0 && enemyhp > 0); //returns if the HP is not yet less than 0, or Pokemon not fainted
  
  //Declaration of Winners
      if(playerhp <= 0) {
         System.out.println("\nYou were defeated!");
         
      }
      else if(enemyhp <= 0) {
         System.out.println("\nYou won! " + pokemonarray[stat] + " defeated " + opponentPokemon);
      }
  //INputting Again       
  do {    
      System.out.print("Do you want to change pokemons? (Please Input Again \"Yes or No\"): ");
         choose = input.next().charAt(0);
         //input music
         inputPoke();
            if (choose == 'y' || choose == 'Y') {
            a = 1;
            // Check if all opponent Pokémon have 0 HPs
                boolean allOpponentFainted = true;
                   for (int hp : healthearray) { //Check Healtharray
                      if (hp > 0) {
                        allOpponentFainted = false;
                        break;
            }
         }
            //Check if all user's Pokémon have 0 HPs
               boolean allFainted = true;
                   for (int enemyhp : healtharray) { //Check Healtharray
                      if (enemyhp > 0) {
                        allFainted = false;
                        break;
            }
         }
   //Winner
          if (allOpponentFainted) {
             System.out.println("\n\n\n=================================================================================================================\nYou've Won!!!!!, " + names + ", All of " + enemy + "'s Pokémon fainted!");
                 Exit2(array, array2, names);
                 return; // Exit the loop as all opponent Pokémon fainted
                }
          else if (allFainted) {
             System.out.println("\n\n\nYou've Lost!!!!!, " + names + ", All of " + enemy + "'s Pokémon defeated you!");
                 ExitE2(array, array2, names);
                 return; // Exit the loop as all player Pokémon fainted
                }
                
          //break continues here  
             pick = ""; // Resetting pick to an empty string to prompt for a new Pokémon choice
             
             System.out.println("\n" + names + "'s Pokemon Deck: ");
                 for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + "[" + healtharray[i] + "hp]" + " "); 
      }
             System.out.println("\n\n" + enemy + "'s Pokemons");
                 for (int i = 0; i < earray.length; i++) {
                    System.out.print(earray[i] + "[" + healthearray[i] + "hp]" + " ");
      } 
   }    
         else {
             System.out.println("Can't Say No, Please Input \"Yes\" Only!...");
                  a = 0;
              // Exit the loop or take appropriate action to end the game     
             }
         }while (a == 0);
 
      }while (non <= 6  || choose == 'Y' || choose == 'y'); 
    }
   //EXIT IF USER WINS
   public static void Exit2(String[] array, String[] array2, String names) {
      if(!PokeOut) {
         System.out.print("\n" + names + ", You are the Strongest in The World!!!!!");
         Win = true;
         return;
      }
   }
   //EXIT IF ENEMY LOSES
   public static void ExitE2(String[] array, String[] array2, String names) {
      if(!PokeOutE) {
         System.out.print("\n" + names + ", You are not able to defeat Arceus!!!!!\nRepeating the Game until you Win!!!\n\n\n");
         Win = false;
         return;
         }
      }
//JAVA PROJECT MAIN METHOD
    public static void main(String[] args) throws InterruptedException {
      Scanner input = new Scanner (System.in);
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
         String help, symbol;
         String start, names= " ", chosenPokemon;
         int menu, option, a = 0, b = 0, close, gender, Newname, i = 0, columns, value, decision, decisionval = 0, challenge, j = 0, p = 0;
         char choosename, change, decide, arceuschoose;
         boolean condition;
//ACT 1 OF POKEMON GAME 
     //Plays the intro music
     introPokemon();
      
     //prints the string animation
     block();
     //goes back to the main method and shows the game 
     
     //Lets the user START the game
     System.out.println("-----------------------------\nPRESS and ENTER 'START'\n-----------------------------");
         start = input.nextLine();
         //input music
         inputPoke();
         
            if (start.contains("START") || start.contains("Start") || start.contains("start")) {
      do {
     //User has 2 options: To go to the Game or Exit
            a = 0;
     System.out.println("-----------------------------\n[1] NEW GAME\n[2] OPTION\n-----------------------------");
         menu = input.nextInt();
         //input music
         inputPoke();
         
        if (menu == 2) {
            System.out.println("-----------------------------\n[1] Cancel & Go Back [2] Exit\n-----------------------------");
                  option = input.nextInt();
                  //input music
                  inputPoke();
                  p = 0;
               if (option == 2) {
               System.out.println("-----------------------------\nAre you sure to close the current game? [1] Close\n-----------------------------");
                     close = input.nextInt();
                     //input music
                     inputPoke();
                  if (close == 1) {
                  // User Exits the Game
                  System.out.print("-----------------------------\nYou Ended the Game!.\n-----------------------------");
                        a = 0;
                        return;
            }
         }
               else if (option == 1) {
                     a = 1;
            }
         }
         else if (menu == 1) {
         p = 1;
         }
         else {
         p = 0;
         }
      } while (a == 1 || p == 0);
      // user enters the game
      
      //Stops the music
      stopIntroPokemon();
      
      //Plays another music
      introPokemon2();
      
         value = 1;
         value = value - 1;
         // user calls the story typewriter
         Type(value);
         // prints the story typewriter
         System.out.print("\n\n");
         // prints dragonite
         block2();
         
         value = 0;
         value = 2;
         value = value - 1;
         System.out.print("---------------------------------------------------------------------------------------------------------------------");
         //user calls the story typewriter again
         Type(value);
         //prints the story typewriter
         System.out.print("\n---------------------------------------------------------------------------------------------------------------------\n\n");
   do {
      b = 0;
         System.out.print("Are you a [1] Boy? or a [2] Girl?: ");
               //Lets the user input his/her gender
               gender = input.nextInt();
               //input music
               inputPoke();
               
            if (gender == 1) {
               // User can use pre-defined names or input his name.
            System.out.print("Alright, \nWhat's your name? \n[1] New Name? \n[2] Ken \n[3] Pablo \n[4] Josh \nAnswer: ");  
                  Newname = input.nextInt();
                  //input music
                  inputPoke();
                  
               if (Newname == 1) {
               System.out.print("Input your name: ");
                     names = scanner.nextLine();
                     //input music
                     inputPoke();
               }
               else if (Newname == 2) {
                     names = "Ken";
               }
               else if (Newname == 3) {
                     names = "Pablo";
               }
               else if (Newname == 4) {
                     names = "Josh";
            }
           }
            else if (gender == 2) {
            // User can use pre-defined names or input her name.
            System.out.print("Alright, \nWhat's your name? \n[1] New Name? \n[2] Suzy \n[3] Charm \n[4] Sam \nAnswer: ");
                  Newname = input.nextInt();
                  //input music
                  inputPoke();
                  
               if(Newname == 1) {
               System.out.print("Input your name: ");
                     names = scanner.nextLine();
                     //input music
                     inputPoke();
               }
               else if (Newname == 2) {
                     names = "Suzy";
               }
               else if (Newname == 3) {
                     names = "Charm";
               }
               else if (Newname == 4) {
                     names = "Sam";
     }
    }
            else {
            names = "No name";
            
     }
            // System ensures/clarifies the name 
            System.out.print("It's " + names + "??? Yes or No: ");
                  choosename = input.next().charAt(0);
                  //input music
                  inputPoke();
                  
            if (choosename == 'y' || choosename == 'Y') {
            // Yes, continues the Game
               b = 0;
            System.out.print("---------------------------------------------------------------------------------------------------------------------\n");
            System.out.print("Professor Oak: Ah, okay! \nProfessor Oak: You're " + names);
               value = 0;
               value = 3;
               value = value - 1;
               //user calls the story typewriter again
               Type(value);
            }
            else if (choosename == 'n' || choosename == 'N') {
            // No, loops it back to the Asking of Gender options
            b = 1; 
            }
            else {
            b = 1;
            } 
            } while (b == 1);
            
         //prints the Pokemon league titlepage
         block3();
         
         System.out.print("\n\n\nLetter from the World Pokemon League....\n=======================================================================================================================================================================================================\n[*][+][*]");
         value = 0;
         value = 4;
         value = value - 1;
         //user calls the story typewriter
         Type(value);
         //prints the story typewriter
         
         value = 0;
         value = 5;
         value = value - 1;
         //user calls the story typewriter
         Type(value);
         //prints the story typewriter
         
         value = 0;
         value = 6;
         value = value - 1;
         //user calls the story typewriter
         Type(value);
         //prints the story typewriter
         
         //prints the Arceus Art
         block4();
         System.out.print("\n[*][+][*]\n=======================================================================================================================================================================================================");
         
         value = 0;
         value = 7;
         value = value - 1;
         //user calls the story typewriter
         Type(value);
         //prints the story typewriter 
     
     do {
      decisionval = 0;
      // Asks the user if he/she is ready to go to the battle
         System.out.print(names + ", Are you up to the Challenge??? [Yes/No]: ");
            challenge = input.next().charAt(0);
            //input music
            inputPoke();
            
            if (challenge == 'y' || challenge == 'Y') { 
            // Yes continues the game
               value = 0;
               value = 8;
               value = value - 1;
               //user calls the story typewriter
               Type(value);
               //user prints the story typewriter
            }
            else if (challenge == 'n' || challenge == 'N') {
            // No, means yes :)
               System.out.println("Think carefully " + names + " ! It is a privelege to join this League, Are you sure you wanna quit. \n\"Note\": If you quit, you quit the game? [Comeback/Quit]");
                    decision = input.next().charAt(0);
                    //input music
                     inputPoke();
                     
                  if (decision == 'c' || decision == 'C'){
                  decisionval = 1;
                  }
                  else if (decision == 'q' || decision == 'Q') {
                  decisionval = 0;
                  System.out.print("You ended the game!");
                  return;
                  }
                  else {
                  decisionval = 1;
                  }
            } 
            else {
            decisionval = 1;
            }           
         } while (decisionval == 1);
         
      
         //prints Pokedex
         block5();
   System.out.print("Professor Oak: " + names + ", These are the Pokemons Registered In the \"World Pokemon League\" \nThis is your Final Team! Here are the Pokemons you will use!!! " + names + ": \n\n");
         // Storage of chosen Pokemons
         String [] array = new String [6];
         // Storage their of chosen Elements 
         String [] array2 = new String [6];
         //List of all choices of Pokemon
         
         //252 List of Pokemons
         String [] PokeArray = {"Garchomp", "Blastoise", "Scizor", "Luxray", "Torterra", "Snorlax", "Infernape",
            "Tyranitar", "Ninetales", "Pikachu", "Charizard", "Hawlucha", "Sceptile", "Empoleon",
            "Megasaur", "Blaziken", "Greninja", "Haunter", "Salamence", "Raichuu", "Caterpie",
            "Croconaw", "Flygon", "Ampharos", "Typhlosion", "Absol", "Dragonite", "Eevee",
             "Gardevoir", "Lucario", "Umbreon", "Arcanine", "Gengar", "Metagross", "Machamp",
             "Gyarados", "Ditto", "Aegislash", "Haxorus", "Slaking", "Hydreigon", "Blissey",
             "Ferrothorn", "Shedinja", "Togekiss", "Goodra", "Mawille", "Torkoal", "Kangaskhan",
             "Kingdra", "Breloom", "Skarmory", "Rotom", "Tangrowth", "Magnezone", "Mamoswine",
             "Volcarona", "Roserade", "Chandelure", "Swampert", "Samurott", "Feraligatr", "Emboar",
             "Delphox", "Serperior", "Chesnaught", "Incineroar", "Meganium", "Jolteon", "Electrivire",
             "Eelektros", "Manetric", "Galvantula", "Zebstrika", "Emolga", "Heliolisk", "Vaporeon",
             "Lapras", "Milotic", "Starmie", "Azumarill", "Wailord", "Sharpedo", "Ludicolo",
             "Crawdaunt", "Leafeon", "Victreebel", "Tropius", "Gogoat", "Houndoom", "Magmortar",
             "Flareon", "Rapidash", "Victini", "Talonflame", "Excadrill", "Flygon", "Steelix",
             "Onix", "Rhyperior", "Sandslash", "Seismitoad", "Dugtrio", "Krookodile", "Tentacruel",
             "Gastrodon", "Noivern", "Altaria", "Staraptor", "Pelipper", "Gliscor", "Weavile",
             "Zoroark", "Mightyena", "Golurk", "Honchkrow", "Glaceon", "Piloswine", "Abomasnow",
             "Froslass", "Glalie", "Glaceon", "Beartic", "Jinx", "Vanilluxe", "Snowver",
             "Alakazam", "Mr.Mime", "Espeon", "Hypno", "Drowzee", "Gallade", "Slowpoke",
             "Wobbuffet", "Ekans", "Arbok", "Nidorina", "Nidorino", "Grimer", "Muk",
             "Weezing", "Gulpin", "Seviper", "Meowth", "Persian", "Garbodor", "Golbat",
             "Slowbro", "Crobat", "Stunktank", "Drapion", "Toxicroak", "Hitmonlee", "Hitmonchan",
             "Hariyama", "Primeape", "Poliwrath", "Medicham", "Donphan", "Geodude", "Hippowdon",
             "Quagsire", "Marowak", "Graveler", "Pinsir", "Karrablast", "Accelgor", "Scatterbug",
             "Butterfree", "Weedle", "Kakuna", "Beedrill", "Parasect", "Scyther", "Ariados",
             "Heracross", "Surskit", "Combee", "Escavalier", "Genesect", "Misdreavus", "Duskull",
             "Drifloon", "Dusclops", "Duskull", "Shuppet", "Sableye", "Driflim", "Aerodactyl",
             "Dusknoir", "Yamask", "Zoroa", "Pidgeotto", "Gorgeist", "Florges", "Mr.Mime",
             "Clefairy", "Dedenne", "Omar", "Gigalith", "Pupitar", "Armaldo", "Porygon",
             "Aipom", "Ursaring", "Miltank", "Vigoroth", "Lopunny", "Stoutland", "Bunnelby",
             "Aggron", "Klinklang", "Bronzong", "Bastiodon", "Spiritomb", "Drapion", "Staraptor", 
             "Pyroar", "Darkrai", "Arceus", "Mew", "MewTwo", "Zekrom", "Ho-Oh", "Moltres", "Lugia",
             "Zapdos", "Articuno", "Entei", "Raikou", "Groudon", "Kyogre", "Latios", "Latias", "Darkrai", 
             "Uxie", "Cresselia", "Dialga", "Rayquaza", "Palkia", "Giratina", "Suicune", "Coballion", "Keldeo",
             "Regirock", "Registeel", "Regice", "Mesprit", "Azelf", "Heatran", "Regigigas", "Terrakion",
             "Virizion", "Thundurus", "Landorus", "Enamorus", "Reshiram", "Kyurem", "Xerneas", "Yveltal",
             "Zygarde", "Arceus", "Arceus-X", "Arceus-Fire", "Arceus-Water", "Arceus-Fairy", "Arceus-Steel", "Arceus-Psychic", "Arceus-Dark" 
             };
        
        //List of all Pokemon Elements
        //19 Pokemon Elements
        String [] ElementsArray = { "Normal", "Fire", "Water", "Grass", "Electric", "Ice",
            "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug",
            "Rock", "Ghost" , "Dragon", "Dark", "Steel", "Fairy", "Rainbow" };
           
         do {
            for (i = 0; i < array.length; i++) {
               System.out.print("Pokemon " + (i + 1) + ": ");
               chosenPokemon = scanner.nextLine();
               //input music
               inputPoke();

            // Check if the chosen Pokemon is in the Pokemon array
            condition = false;
            for (String pokemon : PokeArray) {
                if (pokemon.equals(chosenPokemon)) {
                    condition = true;
                    break;
          }
      }
                     if (condition) {
                           // Check if the chosen Pokemon is already in the team
                        boolean alreadySelected = false;
                           for (j = 0; j < i; j++) {
                              if (array[j].equals(chosenPokemon)) {
                                 alreadySelected = true;
                                 break;
           }
       }
                              if (alreadySelected) {
                                 System.out.println("You've already selected " + chosenPokemon + ". Choose another.");
                                 i--; // Decrement i to allow re-selection
               } 
                              else {
                                 array[i] = chosenPokemon;
          }
      }  
                     else {
                        System.out.println("Invalid Input! Please choose a valid Pokemon.");
                        i--; // Decrement i to allow re-selection
            }
        }

        // Display the selected team
        System.out.println("\n\nYour Final Pokemon Team:");
         for (String pokemon : array) {
            System.out.println(pokemon);
        }
    
         //prints Elementlist
        block6();
     System.out.print("Professor Oak: " + names + ", Now that you have chosen your Pokemon Team. \nProfessor Oak: Determine the true element of your Pokemon Team.\n\n");
        
            for (i = 0; i < array2.length; i++) {
               System.out.print("Enter the Element of your Pokemon " + (i + 1) + " " + "(" + array[i] + ") " + ": ");
                  String Elementschoose = scanner.nextLine();
                  //input music
                  inputPoke();
                  
               condition = false;
               for(String elements : ElementsArray) {
                  if (elements.equals(Elementschoose)) {
                     condition = true;
                     break;
                  }
               }  
                if (!condition){
                   System.out.println("Invalid Input! Please choose a valid Element-Type.");
                   i--;       
               }
                else {
                array2[i] = Elementschoose;
                }
             }
         // Clarifies if the user wants to change their Pokemons
         System.out.print("\nDo you wish to make change your Pokemons? [Yes/No]: ");
            change = input.next().charAt(0);
            //input music
            inputPoke();
               if (change == 'y' || change == 'Y') {
                  a = 1;
         }
               else if (change == 'n' || change == 'N') {
                  a = 0;
         }  
               else {
               System.out.print("Invalid Input!, Returning to the Picking Panel\n");
                  a = 1;
         }
      }while (a == 1);
         // Shows your final Pokemon Deck
         System.out.print("\nHere are your final Pokemons, " + names + " :");
         System.out.print("\n=================================================================\n\n");
            for (i = 0; i < array.length; i++) {
                 System.out.println("Pokemon " + array[i] + " (" + array2[i] + "-Type)");
         }
         System.out.print("\n=================================================================\n");
     
       value = 0;
       value = 9;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       System.out.print(names + "!!! \n");
       
       //Stops the music
       stopIntroPokemon2();
       
       //Plays another music
       introPokemon3();

//ACT 2 OF POKEMON GAME
       System.out.print("\n\n\n=======================================================================================================================================================================================================\n[*][+][*]");
       value = 0;
       value = 10;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       
       //prints the Wobbuffet art
       block7();
       
       value = 0;
       value = 11;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       
       //prints the Pokemon league titlepage
       block3();
       
       value = 0;
       value = 12;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
   
       System.out.print(" " + names + ", A Challenger In This League!!! \n" + names + ": I'm not gonna lose to anybody, I will win and will learn from this League!!!, Let's Go Team!!! \nPokemons: Shesshhhh - Shesshhh!!!");
       
       value = 0;
       value = 13;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter 
           
       //Stops the music
       stopIntroPokemon3();
       
       //Plays another music
       introPokemon4();
       
       // Define the trainers
       // List og Pokemon Champions
       String[] originalTrainers = {"Ash", "Cynthia", "Diantha", "Steven", "Flint", "Leon", "Iris", "Alder", "Blue", "Wallace", "Tobias", "Giovanni", "Raihan", "Paul", "Lysandre", names};
       try {
         Thread.sleep(3000);
       }
       catch (InterruptedException x) {
       x.printStackTrace();
       }
       System.out.print("\n=================================================================================================================\n\n1st Battle : Ash vs Flint \n2nd Battle : Leon vs Blue \n3rd Battle : Steven vs Diantha \n4th Battle : Iris vs Alder \n5th Battle : Wallace vs Tobias \n6th Battle : Giovanni vs Raihan \n7th Battle : Paul vs Cynthia \n8th Battle : Lysandre vs " + names + "\n\n=================================================================================================================");
      
      
       //Battle for Lysandre
         System.out.print("\n[*][+][*]\nQuarterFinals Round");
         while (Win) {
            OpeningMarks(array, array2, names);
            BattleStart(array, array2, names);
            //Back Up Method if user Loses to Lysandre
         if (!Win) {
            resetVariables5(array, array2, names);
            //OpeningMarks(array, array2, names);
            //BattleStart(array, array2, names);
         }
         else {
         break;
         }
      }
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("\n=================================================================================================================\n[*][+][*]\nQuarterFinals Round Results \n\n");
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("Results Board: \nAsh vs Flint = Ash wins!\nLeon vs Blue = Leon wins!\nSteven vs Diantha = Steven wins!\nIris vs Alder = Iris wins!\nWallace vs Tobias = Tobias wins!\nGiovanni vs Raihan = Giovanni wins!\nPaul vs Cynthia = Cynthia wins!\nLysandre vs " + names + " = " + names + " wins!\n[*][+][*]\n=================================================================================================================\n\n");
         try {
               Thread.sleep(5000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
             
         //Resetting the variables for Battle with Cynthia
         System.out.print("[*][+][*]\nSemiFinals Round\n");
         System.out.print("Ash vs Leon \nSteven vs Iris \nTobias vs Giovanni \nCynthia vs " + names + "\n");
         while (Win) {   
            resetVariables(array, array2, names);
            OpeningMarks(array, array2, names);
            BattleStart(array, array2, names);
            //Back Up Method if user Loses to Cynthia
         if (!Win) {
            resetVariables(array, array2, names);
            //OpeningMarks(array, array2, names);
            //BattleStart(array, array2, names);
         }
         else {
         break;
         }
       }
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("\n\n=================================================================================================================\n[*][+][*]\nSemiFinals Round Results \n\n");
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("Results Board: \nAsh vs Leon = Ash wins!\nSteven vs Iris = Steven wins!\nTobias vs Giovanni = Tobias wins!\nCynthia vs " + names + " = " + names + " wins!\n[*][+][*]\n=================================================================================================================\n\n");
         try {
               Thread.sleep(5000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         //Resetting the variables for Battle with Tobias
         System.out.print("[*][+][*]\nFinal 4 Round\n");
         System.out.print("Ash vs Steven \nTobias vs " + names);
         while (Win) {
            resetVariables2(array, array2, names);
            OpeningMarks(array, array2, names);
            BattleStart(array, array2, names);  
            //Back Up Method if User Loses to Tobias
         if (!Win) {
            resetVariables2(array, array2, names);
            //OpeningMarks(array, array2, names);
            //BattleStart(array, array2, names);
         }  
         else {
         break;
         } 
       }    
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("\n\n=================================================================================================================\n[*][+][*]\nFinals 4 Round Results \n\n");
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("Ash vs Steven = Ash wins\nTobias vs " + names + " = " + names + " wins!\n[*][+][*]\n=================================================================================================================\n\n");
         try {
               Thread.sleep(5000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         //Resetting the variables for Battle with Ash
         System.out.print("[*][+][*]\nFinal Round: \n");
         System.out.print("Champion Ash vs Champion " + names);
         while (Win) {
            resetVariables3(array, array2, names);
            OpeningMarks(array, array2, names);
            BattleStart(array, array2, names);
            //Back Up Method if User Loses to Ash
         if (!Win) {
            resetVariables3(array, array2, names);
            //OpeningMarks(array, array2, names);
            //BattleStart(array, array2, names);
         }
         else {
         break;
         }
       }
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("\n\n=================================================================================================================\n[*][+][*]\nFinals Round Results \n\n");
         try {
               Thread.sleep(3000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
         System.out.print("Champion Ash vs Champion " + names + " = " + names + " wins!\n=================================================================================================================\n\n");
         try {
               Thread.sleep(6000);
             }
         catch (InterruptedException x) {
             x.printStackTrace();
             }
       System.out.print(names + " is the winner of the Finals of the World Pokemon League!!![*][+][*]");
         
       value = 0;
       value = 14;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       
       //prints the Wobbuffet art
       block7();
       
       value = 0;
       value = 15;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       
       //prints badge
       block8();
       
       //Stops the music
       stopIntroPokemon4();
       
       //Plays another music
       introPokemon5();
        
       value = 0;
       value = 16;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
       
       //prints the Arceus art
       block4();
       
       value = 0;
       value = 17;
       value = value - 1;
       //user calls the story typewriter
       Type(value);
       //user prints the story typewriter
    
    do {
       System.out.print("\nArceus challenges you to a battle: Would you want to accept his challenge? [y/n]: ");
            arceuschoose = input.next().charAt(0);
            //input music
            inputPoke();
            
         if (arceuschoose == 'y' || arceuschoose == 'Y') {
            a = 0;
         while (Win) {
            resetVariables4(array, array2, names);
            OpeningMarks2(array, array2, names);
            BattleStart2(array, array2, names);
            //Back Up Method if User Loses to Arceus
            if (!Win) {
               resetVariables4(array, array2, names);
               //OpeningMarks2(array, array2, names);
               //BattleStart2(array, array2, names);
         }
            else {
               break;
         }
       }
     }
         else {
            a = 1;
            System.out.print("You can't choose another option!!!");
         }
       }while (a == 1);
       
     value = 0;
     value = 18;
     value = value - 1;
     //user calls the story typewriter
     Type(value);
     //user prints the story typewriter
     
     //prints the Arceus art
       block4();
     
     //Stops the music
     stopIntroPokemon5();
     
     //Plays another music
     introPokemon2();

     value = 0;
     value = 19;
     value = value - 1;
     //user calls the story typewriter
     Type(value);
     //user prints the story typewriter
  
     //prints the string animation
     block();
     
     //prints the Pokemon league titlepage
     block3();
     
     System.out.print("\n\n\n                All Rights Reserved SammyXPWorks' Projects 2023 \n                                \"THE END\"");
     
     try {
          Thread.sleep(20000);
          }
     catch (InterruptedException x) {
          x.printStackTrace();
          }

     //Stops the music
     stopIntroPokemon2();
    }
   }
  }
      
