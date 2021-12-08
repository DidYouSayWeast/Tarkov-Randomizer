import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;





 public class TarkovRandomizer {
        public static String ChosenGun;
        public static String ChosenHelmet;
        public static String ChosenRig;
        public static String ChosenArmor;
        public static String ChosenRound;
        public static String ChosenBackPack;
        public static String ChosenArmoredRig;

        public static void Randomize() {

               ArrayList<String> NineByThirtyNineGun = new ArrayList<String>(Arrays.asList("AS VAL", "VSS"));
               ArrayList<String> NineByThirtyNineRound = new ArrayList<String>(Arrays.asList("7N9 SPP", "7N12 BP", "SP-5", "SP-6"));


               ArrayList<String> NineByNineteenGun = new ArrayList<>(Arrays.asList("MP5, MP5K-N", "MP9", "MP9-N", "MPX", "PP-19", "Saiga-9", "STM-9", "Vector", "GLOCK17", "GLOCK18", "M9A3", "MP-443", "P226R", "PL-15"));
               ArrayList<String> NineByNineteenRound = new ArrayList<String>(Arrays.asList("7N31", "AP 6.3", "Green Tracer", "Luger CCI", "PSO gzh", "Pst gzh", "QuakeMaker", "RIP"));


               ArrayList<String> NineByEighteenGun = new ArrayList<String>(Arrays.asList("PP-9", "PP-91", "PP-91-01", "APB", "APS", "PB Pistol", "PM (t)", "PM"));
               ArrayList<String> NineByEighteenRound = new ArrayList<String>(Arrays.asList("9 BZT gzh", "9 P gzh", "PBM", "PPe gzh", "PPT gzh", "PRS gs", "PS gs PPO", "PSO gzh", "Pst gzh", "PSV", "SP7 gzh", "SP8 gzh", "mm RG028 gzh"));


               ArrayList<String> NineByTwentyOneGun = new ArrayList<String>(Arrays.asList("SR-1MP"));
               ArrayList<String> NineByTwentyOneRound = new ArrayList<String>(Arrays.asList("SP10", "SP11", "SP12", "SP13"));


               ArrayList<String> SevenSixTwoByTwentyFiveGun = new ArrayList<String>(Arrays.asList("TT Pistol", "TT Pistol (Gold)", "PPSH-41"));
               ArrayList<String> SevenSixTwoByTwentyFiveRound = new ArrayList<String>(Arrays.asList("AKBS", "FMJ43", "LRN", "LRNPC", "P gl", "Pst gzh", "PT gzh"));


               ArrayList<String> FiveSevenByTwentyEightGun = new ArrayList<String>(Arrays.asList("P90", "FN 5-7"));
               ArrayList<String> FiveSevenByTwentyEightRound = new ArrayList<String>(Arrays.asList("L191", "R37.F", "R37.X", "SB193", "SS190", "SS197SR", "SS198LF"));


               ArrayList<String> FortySixByThirtyGun = new ArrayList<String>(Arrays.asList("MP7A1", "MP7A2"));
               ArrayList<String> FortySixByThirtyRound = new ArrayList<String>(Arrays.asList("Action SX", "AP SX", "FMK SX", "Subsonic SX"));


               ArrayList<String> FortyFiveGun = new ArrayList<String>(Arrays.asList("UMP 45", "Vector .45", "M1911A1", "M45A1"));
               ArrayList<String> FortyFiveRound = new ArrayList<String>(Arrays.asList("AP", "FMJ", "Hydra-Shok", "Lasermatch FMF", "RIP"));


               ArrayList<String> TwelveBySeventyGun = new ArrayList<String>(Arrays.asList("590A1", "M870", "MP-133", "MP-153", "Saiga-12"));
               ArrayList<String> TwelveBySeventyRound = new ArrayList<String>(Arrays.asList("Poleva-3 Slug", "Poleva-6u Slug", "5.25mm Buckshot", "8.5 mm Magnum Buckshot", "AP-20 Slug", "Dual Sabot Slug", "Flechette", "FTX Custom LIte Slug", "Grizzly 40 Slug", "HP Slug SuperFormance", "HP Slug Copper Sabot Premier", "6.5 mm Express Buckshot", "7mm Buckshot", "Led slug", "RIP", "shell with .50 BMG bullet"));


               ArrayList<String> TwentyBySeventyGun = new ArrayList<String>(Collections.singletonList("TOZ-106"));
               ArrayList<String> TwentyBySeventyRound = new ArrayList<String>(Arrays.asList("5.6mm Buckshot", "6.2mm Buckshot", "7.3mm Buckshot", "Devastator Slug", "Poleva-3", "Poleva-6u", "Star Slug", "7.5mm Buckshot"));


               ArrayList<String> TwentyThreeBySeventyFiveGun = new ArrayList<String>(Arrays.asList("KS-23"));
               ArrayList<String> TwentyThreeBySeventyFiveRound = new ArrayList<String>(Arrays.asList("Barricade", "Star", "Shrapnel 10", "Shrapnel-25"));


               ArrayList<String> ThreeSixSixGun = new ArrayList<String>(Arrays.asList("Vepr AKM", "VPO-215"));
               ArrayList<String> ThreeSixSixRound = new ArrayList<String>(Arrays.asList("AP", "TKM EKO", "TKM FMJ", "TKM Geksa"));


               ArrayList<String> SevenSixTwoByFiftyOneGun = new ArrayList<String>(Arrays.asList("DT MDR", "Kel-Tec RFB", "SA-58", "Vepr Hunter", "M1A", "RSASS", "SR-25", "DVL-10", "M700", "T-5000"));
               ArrayList<String> SevenSixTwoByFiftyOneRound = new ArrayList<String>(Arrays.asList("BPZ FMJ", "M61", "M62", "M80", "M993", "TPZ SP", "Ultra Nosier"));


               ArrayList<String> SevenSixTwoByFiftyFourGun = new ArrayList<String>(Arrays.asList("SVDS", "Mosin", "Mosin Inf.", "SV-98"));
               ArrayList<String> SevenSixTwoByFiftyFourRound = new ArrayList<String>(Arrays.asList("7BT1", "7N1", "7N37", "LPS Gzh", "SNB", "T-46M"));


               ArrayList<String> GrenadeG = new ArrayList<String>(Arrays.asList("Grenades"));
               ArrayList<String> GrenadeR = new ArrayList<String>(Arrays.asList("F-1", "M67", "RGD-5", "VOG-17","VOG-25"));

               ArrayList<String> GL40G = new ArrayList<String>(Arrays.asList("GL40"));
               ArrayList<String> GL40R = new ArrayList<String>(Arrays.asList("M381 (HE)", "M386(HE)", "M406 (HE)", "M433 (HEDP)", "M441(HE)", "M576(MP-APERS)"));


               ArrayList<String> ThreeThreeEightGun = new ArrayList<String>(Arrays.asList("Mk-18"));
               ArrayList<String> ThreeThreeEightRound = new ArrayList<String>(Arrays.asList("AP", "FMJ", "TAC-X", "UPZ"));


               ArrayList<String> SevenSixTwoByThirtyNineGun = new ArrayList<String>(Arrays.asList("AK-103", "AK-104", "AKM", "AKMN", "AKMS", "AKMSN", "Vepr KM", "SKS", "OP-SKS"));
               ArrayList<String> SevenSixTwoByThirtyNineRound = new ArrayList<String>(Arrays.asList("BP", "HP", "MAI AP", "PS", "T45M", "US"));


               ArrayList<String> FiveFiveSixByFortyFiveGun = new ArrayList<String>(Arrays.asList("ADAR 2-15", "AK-101", "AK-102", "DT MDR", "HK 416A5", "M4A1", "TX-15 DML"));
               ArrayList<String> FiveFiveSixByFortyFiveRound = new ArrayList<String>(Arrays.asList("55 FMJ", "55 HP", "M855", "M855A1", "M856", "M856A1", "M995", "Mk 255 Mod 0", "SSA AP", "Warmage"));


               ArrayList<String> FiveFourFiveByThirtyNineGun = new ArrayList<String>(Arrays.asList("AK-105", "AK-74", "AK-74M", "AK-74N", "AKS-74N", "AKS-74U", "AKS-74UB", "AKS-74UN", "RPK-16"));
               ArrayList<String> FiveFourFiveByThirtyNineRound = new ArrayList<String>(Arrays.asList("7N39 Igolnik", "BP", "BS", "BT", "FMJ", "HP", "PP", "PRS", "PS", "SP", "T", "US"));


               ArrayList<String> TwelvePointSevenByFiftyFiveGun = new ArrayList<String>(Arrays.asList("Ash-12"));
               ArrayList<String> TwelvePointSevenByFiftyFiveRound = new ArrayList<String>(Arrays.asList("PS12", "PS12A", "PS12B"));


               ArrayList<String> ThreeHundredGun = new ArrayList<String>(Arrays.asList("MCX"));
               ArrayList<String> ThreeHundredRound = new ArrayList<String>(Arrays.asList("AP", "BPZ AAC"));


               ArrayList<ArrayList> GunList = new ArrayList<ArrayList>(Arrays.asList(
                       NineByThirtyNineGun,
                       NineByNineteenGun,
                       NineByEighteenGun,
                       NineByTwentyOneGun,
                       SevenSixTwoByTwentyFiveGun,
                       FiveSevenByTwentyEightGun,
                       FortySixByThirtyGun,
                       FortyFiveGun,
                       TwelveBySeventyGun,
                       TwentyBySeventyGun,
                       TwentyThreeBySeventyFiveGun,
                       ThreeSixSixGun,
                       SevenSixTwoByFiftyOneGun,
                       SevenSixTwoByFiftyFourGun,
                       ThreeThreeEightGun,
                       SevenSixTwoByThirtyNineGun,
                       FiveFiveSixByFortyFiveGun,
                       FiveFourFiveByThirtyNineGun,
                       TwelvePointSevenByFiftyFiveGun,
                       ThreeHundredGun,
                       GrenadeG,
                       GL40G
               ));


               ArrayList<String> helmets = new ArrayList<String>(Arrays.asList("None",
                       "Soft tank crew helmet",
                       "Kolpak-1S",
                       //"Jack-o'-lantern tactical pumpkin helmet",
                       "SHPM Firefighter's helmet",
                       "PSH-97 Jeta",
                       "DEVTAC Ronin",
                       "Tac-Kek Fast MT",
                       "DEVTAC Ronin",
                       "UNTAR",
                       "6B47",
                       "SSh-68",
                       "LZSh",
                       "Kiver-M",
                       "SSSh-95 Sfera-S",
                       "MSA ACH TC-2001",
                       "MSA ACH TC-2002",
                       "MAS Gallet TC 800",
                       "Diamond Age Bastion",
                       "Galvion Caiman",
                       "Highcom Striker ACHHC IIIA",
                       "Ops-Core Fast MT",
                       "ZSh-1-2M",
                       "Highcom Striker ULACH IIIA",
                       "Crye Precision Airframe",
                       "Team Wendy EXFIL",
                       "BNTI LSHZ-2DTM Helmet",
                       "Maska 1Sch",
                       "Altyn",
                       "Rys-T",
                       "Wilcox Skull Lock head mount",
                       "Armasight NVG mask",
                       "Vulkan-5 (LShZ-5) heavy helmet",
                       //Vanity not finished list
                       "Kinda Cowboy Hat",
                       "Ushanka Ear-Flap Cap",
                       "Door Kicker Boonie Hat"
               ));


               ArrayList<String> armor = new ArrayList<String>(Arrays.asList("None",
                       "Module-3M",
                       "PACA",
                       "6B2 (Flora)",
                       "MF-UNTAR",
                       "Zhuk-3",
                       "6B23-1",
                       "BNTI Kirasa-N",
                       "6B13",
                       "6B23-2",
                       "BNTI Gzhel-K",
                       "BNTI Korund-VM",
                       "FORT Redut-M body armor",
                       "Highcom Trooper TFO",
                       "6B13 M (Killa)",
                       "IOTV Gen4 HMK",
                       "IOTV Gen4 Assault",
                       "IOTV Gen4 Full",
                       "FORT Redut-T5 body armor",
                       "FORT Defender-2",
                       "5.11 Hexgrid",
                       "LBT 6094A Slick",
                       "Zhuk-6a heavy armor",
                       "6B43 Zabralo"
               ));

               ArrayList<String> armoredRigs = new ArrayList<String>(Arrays.asList("None",
                       "6B5-16",
                       "6B3TM-01M",
                       "6B5-15",
                       "ANA Tactical M2",
                       "ANA Tactical M1",
                       "AVS",
                       "A18",
                       "TV-110",
                       "Tactec",
                       "MOD.2 AACPC"
               ));


               ArrayList<String> rigs = new ArrayList<String>(Arrays.asList("None",
                       "Scav Vest",
                       "Security Vest",
                       "DIY IDEA",
                       "Bank Robber",
                       "SOE Micro",
                       "Wartech",
                       "CSA",
                       "UMTBS 6sh112",
                       "Tarzan",
                       "Haley Strategic D3CRX",
                       "Triton",
                       "Blackhawk!",
                       "Thunderbolt",
                       "Craft GC-BSS-MK1",
                       "Umka M33-SET1",
                       "LBT-1961A",
                       "BlackRock",
                       "Wartech MK3",
                       "Alpha",
                       "Azimut SS Jhuk",
                       "Velocity Systems Multi-Purpose",
                       "Belt-A + Belt-B"
               ));


               ArrayList<String> backpacks = new ArrayList<String>(Arrays.asList(
                       "None",
                       "6SH118 Raid",
                       "LBT-2670 Slim Feild Med Pack",
                       "Mystery Ranch Blackjack",
                       "Eberlestock F4 Terminator",
                       "Attack 2",
                       "Pilgrim",
                       "Paratus",
                       "Eberlestock G2 Gunslinger II",
                       "Oakley Mechanism",
                       "Tri-Zip",
                       "Beta 2",
                       "Eberlestock F5 Switchblade",
                       "Hazard4 Takedown Sling",
                       "Wartech Berkut",
                       "LBT-8005A Day Pack",
                       "Scav Backpack",
                       "MBSS",
                       "Sanitar Bag",
                       "Duffle Bag",
                       "LK 35 Transfer Tourist",
                       "Transformer Bag",
                       "VKBO Army Bag",
                       "Tactical Sling"
               ));

               Random random = new Random();


               System.out.println(("Helmet: " + helmets.get(random.nextInt((helmets.size())))));

               if ((random.nextInt(2)) > 0) {
                      System.out.println(("Armored Rig: " + armoredRigs.get(random.nextInt((armoredRigs.size())))));
                      ChosenArmoredRig = armoredRigs.get(random.nextInt((armoredRigs.size())));
                      ChosenArmor = "1";
                      ChosenRig ="1";

               } else {

                      System.out.println(("Armor: " + armor.get(random.nextInt((armor.size())))));
                      ChosenArmor = armor.get(random.nextInt((armor.size())));

                      System.out.println(("Rig: " + rigs.get(random.nextInt((rigs.size())))));
                      ChosenRig = rigs.get(random.nextInt((rigs.size())));

                      ChosenArmoredRig = "1";
               }


               System.out.println(("BackPack: " + backpacks.get(random.nextInt((backpacks.size())))));

               ArrayList<String> GunName = (GunList.get(random.nextInt((GunList.size()))));

               System.out.println("Gun: " + GunName.get(random.nextInt((GunName.size()))));


               if (GunName == NineByThirtyNineGun) {
                      ChosenRound = NineByThirtyNineRound.get(random.nextInt((NineByThirtyNineRound.size())));
               }
               if (GunName == NineByNineteenGun) {
                      ChosenRound = NineByNineteenRound.get(random.nextInt((NineByNineteenRound.size())));
               }
               if (GunName == NineByEighteenGun) {
                      ChosenRound = NineByEighteenRound.get(random.nextInt((NineByEighteenRound.size())));
               }
               if (GunName == NineByTwentyOneGun) {
                      ChosenRound = NineByTwentyOneRound.get(random.nextInt((NineByTwentyOneRound.size())));
               }
               if (GunName == SevenSixTwoByTwentyFiveGun) {
                      ChosenRound = SevenSixTwoByTwentyFiveRound.get(random.nextInt((SevenSixTwoByTwentyFiveRound.size())));
               }
               if (GunName == FiveSevenByTwentyEightGun) {
                      ChosenRound = FiveSevenByTwentyEightRound.get(random.nextInt((FiveSevenByTwentyEightRound.size())));
               }
               if (GunName == FortySixByThirtyGun) {
                      ChosenRound = FortySixByThirtyRound.get(random.nextInt((FortySixByThirtyRound.size())));
               }
               if (GunName == FortyFiveGun) {
                      ChosenRound = FortyFiveRound.get(random.nextInt((FortyFiveRound.size())));
               }
               if (GunName == TwelveBySeventyGun) {
                      ChosenRound = TwelveBySeventyRound.get(random.nextInt((TwelveBySeventyRound.size())));
               }
               if (GunName == TwentyBySeventyGun) {
                      ChosenRound = TwentyBySeventyRound.get(random.nextInt((TwentyBySeventyRound.size())));
               }
               if (GunName == TwentyThreeBySeventyFiveGun) {
                      ChosenRound = TwentyThreeBySeventyFiveRound.get(random.nextInt((TwentyThreeBySeventyFiveRound.size())));
               }
               if (GunName == ThreeSixSixGun) {
                      ChosenRound = ThreeSixSixRound.get(random.nextInt((ThreeSixSixRound.size())));
               }
               if (GunName == SevenSixTwoByFiftyOneGun) {
                      ChosenRound = SevenSixTwoByFiftyOneRound.get(random.nextInt((SevenSixTwoByFiftyOneRound.size())));
               }
               if (GunName == SevenSixTwoByFiftyFourGun) {
                      ChosenRound = SevenSixTwoByFiftyFourRound.get(random.nextInt((SevenSixTwoByFiftyFourRound.size())));
               }
               if (GunName == ThreeThreeEightGun) {
                      ChosenRound = ThreeThreeEightRound.get(random.nextInt((ThreeThreeEightRound.size())));
               }
               if (GunName == SevenSixTwoByThirtyNineGun) {
                      ChosenRound = SevenSixTwoByThirtyNineRound.get(random.nextInt(SevenSixTwoByThirtyNineRound.size()));
               }
               if (GunName == FiveFiveSixByFortyFiveGun) {
                      ChosenRound = FiveFiveSixByFortyFiveRound.get(random.nextInt((FiveFiveSixByFortyFiveRound.size())));
               }
               if (GunName == FiveFourFiveByThirtyNineGun) {
                      ChosenRound = FiveFourFiveByThirtyNineRound.get(random.nextInt((FiveFourFiveByThirtyNineRound.size())));
               }
               if (GunName == TwelvePointSevenByFiftyFiveGun) {
                      ChosenRound = TwelvePointSevenByFiftyFiveRound.get(random.nextInt((TwelvePointSevenByFiftyFiveRound.size())));
               }
               if (GunName == ThreeHundredGun) {
                      ChosenRound = ThreeHundredRound.get(random.nextInt((ThreeHundredRound.size())));
               }
               if (GunName == GrenadeG) {
                      ChosenRound = GrenadeR.get(random.nextInt((ThreeHundredRound.size())));
               }
               if (GunName == GL40G) {
                      ChosenRound = GL40R.get(random.nextInt((ThreeHundredRound.size())));
               }

               ChosenHelmet = helmets.get(random.nextInt((helmets.size())));
               ChosenBackPack = backpacks.get(random.nextInt((backpacks.size())));
               ChosenGun = GunName.get(random.nextInt((GunName.size())));



               }
        }

