import java.util.*;

public class GetWordData {

    private String topic;
//    private final String API_key = "W+vh5nItJvK8jXhbKH2x0g==JJe0UK88tZZBGS1n";

    public GetWordData(String topic) {
        this.topic = topic.replace(" ", "");
    }


    public String getWord() {


        if (Objects.equals(this.topic, "nature")){
            return natureList[(int) (Math.random() * natureList.length)];
        } else if (Objects.equals(this.topic, "food")) {
            return foodList[(int) (Math.random() * foodList.length)];
        }else if (Objects.equals(this.topic, "sports")) {
            return sportList[(int) (Math.random() * sportList.length)];
        }else if (Objects.equals(this.topic, "body")) {
            return bodyList[(int) (Math.random() * bodyList.length)];
        }else if (Objects.equals(this.topic, "animal")) {
            return animalList[(int) (Math.random() * animalList.length)];
        }else if (Objects.equals(this.topic, "travel")) {
            return travelList[(int) (Math.random() * travelList.length)];
        }


//        try {
//            URL url = new URL("https://api.api-ninjas.com/v1/animals?name=" + topic.replace(" ", "+") + "&apikey=" + API_key);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestProperty("X-Api-Key", API_key);
//            System.out.println(connection);
//            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                String inputLine;
//                StringBuilder response = new StringBuilder();
//
//                while ((inputLine = in.readLine()) != null) {
//                    response.append(inputLine);
//                }
//
//                in.close();
//                String res = response.toString();
//                res = res.substring(1, res.length() - 1);
//
//                return res;
//            } else {
//                return "Error: " + connection.getResponseCode() + " " + connection.getResponseMessage();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }

        return null;
    }


    private final String[] natureList = {"Abundant", "Aquatic", "Azure", "Bedrock", "Breeze", "Burrow", "Canopy", "Cliff", "Cloud", "Coral", "Current", "Debris", "Desert", "Dew", "Dirt", "Driftwood", "", "Earth", "Eddy", "Ephemeral", "Evergreen", "Fawn", "Forest", "Frost", "Glacier", "Grass", "Gully", "Habitat", "Horizon", "Humidity", "Ice", "Insect", "Iridescence", "Lake", "Lichen", "Meadow", "Mist", "Mountain", "Mud", "Nest", "Oasis", "Ocean", "Osprey", "Palm", "Pebble", "Plain", "Plankton", "Pod", "Predator", "Rain", "Reef", "River", "Sand", "Sapling", "Savannah", "Shore", "Sky", "Sleet", "Soil", "Sound", "Spring", "Star", "Stream", "Sun", "Swamp", "Taiga", "Temperate", "Tide", "Topography", "Tree", "Tundra", "Twilight", "Undergrowth", "Valley", "Vegetation", "Volcano", "Water", "Weather", "Wind", "Zephyr", "Algae", "Arctic", "Bamboo", "Bark", "Bog", "Boulder", "Canyon", "Coral Reef", "Cypress", "Ecology", "Erosion", "Fern", "Forest Fire", "Glacier", "Grassland", "Geyser", "Glade", "", "Grove", "Heat Wave", "Hurricane", "Iceberg", "Jungle", "Lake", "Lichen", "Lush", "Marsh", "Meadow", "Monsoon", "Oasis", "Owl", "Pine", "Prairie", "Rainforest", "Ridge", "Rockslide", "Savannah", "Solstice", "Sparrow", "Swamp", "Thunderstorm", "Tundra", "Volcano", "Wetland", "Wilderness", "Windstorm", "Yellowstone", "Pond", "Fern", "Sailors", "Fishermen", "Moonlight", "Moon", "Floods", "Volcano", "Rainforest", "Ecosystem", "Dandelion", "Scientists", "Cave", "Sand", "Earth", "Fauna", "Landscape", "Alpenglow", "Photosynthesis", "Heron", "Pastures", "Cliff", "Twigs", "Horizon", "Ripples", "Landmarks", "Acorn", "Moorland", "Climbers", "Farmers", "Freeze", "Stream", "Nectar", "Northamptonshire", "Shepherds", "Heron", "Cygnet", "Newt", "Otter", "Kingfisher", "Lark", "Bluebell", "Environment", "Natural", "Eggs", "Ash", "Wings", "Beak", "Shadow", "Rising Sun", "Fungus", "Crofters", "Shower", "Heather"};
    private final String[] foodList   = {"Appetizer", "Aroma", "Bake", "Bland", "Course", "Cuisine", "Cutlery", "Delicious", "Dessert", "Diet", "Entrée", "Fast food", "Flavour", "Fry", "Grain", "Grill", "Healthy", "Hungry", "Ingredients", "Junk food", "Kettle", "Knife", "Ladle", "Meal", "Menu", "Nutritious", "Organic", "Palate", "Pantry", "Plate", "Recipe", "Restaurant", "Roast", "Salad", "Savoury", "Seasoning", "Serve", "Simmer", "Snack", "Spices", "Spoon", "Steam", "Sweet", "Table", "Taste", "Tasty", "Utensils", "Vegan", "Vegetables", "Whisk", "Yummy", "Zest", "Zucchini"};
    private final String[] sportList  = {"Athlete", "Ball", "Champion", "Competition", "Dribble", "Exercise", "Fitness", "Goal", "Health", "Injury", "Jump", "Kick", "League", "Match", "Nutrition", "Olympics", "Player", "Quick", "Run", "Score", "Team", "Uniform", "Victory", "WorkoutAthletic", "Basketball", "Coach", "Dive", "Endurance", "Fitness", "Gymnastics", "Hurdle", "Inning", "Jumping", "Kickboxing", "Lacrosse", "Medal", "Net", "Outdoor", "Pitch", "Quarterback", "Referee", "Sprint", "Tennis", "Umpire", "Volleyball", "Whistle", "Xtreme", "Yoga", "Zumba"};
    private final String[] bodyList   = {"Anatomy", "Person", "Organ", "Body", "Muscle", "Bone", "Skin", "Blood", "Heart", "Brain", "Lung", "Stomach", "Nerve", "Cell", "Tissue", "Joint", "Spine", "Liver", "Kidney", "Skeletal", "Digestive", "Respiratory", "Circulatory", "Immune", "Endocrine", "Sensory", "Metabolism", "Epidermis", "Pulse", "Vein", "Artery", "Capillary", "Esophagus", "Pancreas", "Thyroid", "Adrenal", "Gland", "Cartilage", "Lymph", "Spleen", "Bladder", "Intestine", "Reproductive", "Uterus", "Ovary", "Testicle", "Thymus", "Pituitary", "Gallbladder", "Bronchus", "Trachea", "Diaphragm", "Vertebra", "Femur", "Radius", "Tendon", "Ligament", "Cranium", "Pelvis", "Phalanges", "Axial", "Appendicular", "Dermis", "Cerebellum", "Cornea", "Retina", "Eardrum", "Cochlea", "Pupil", "Iris", "Sweat", "Saliva", "Mucus", "Enzyme", "Hormone", "Antibody", "White blood cell", "Platelet", "Neuron", "Synapse", "Axon", "Dendrite", "Myelin", "Cervical", "Thoracic", "Lumbar", "Sacral", "Coccyx", "Clavicle", "Scapula", "Humerus", "Ulna", "Radius", "Fibula", "Tibia", "Metatarsal", "Phalanges", "Sternum", "Ribs"};
    private final String[] animalList = {"frog", "frogspawn", "newt", "tadpole", "toad", "harvestman", "scorpion", "spider", "tarantula", "albatross", "biddy", "blackbird", "canary", "crow", "cuckoo", "dove,", "pigeon", "duck", "eagle", "falcon", "finch", "flamingo", "goose", "gull", "hawk", "jackdaw", "jay", "kestrel", "kookaburra", "mallard", "nightingale", "nuthatch", "ostrich", "owl", "parakeet", "parrot", "peacock", "pelican", "penguin", "pheasant", "piranha", "raven", "robin", "rooster", "sparrow", "stork", "swallow", "swan", "swift", "tit", "turkey", "vulture", "woodpecker", "wren", "silkworm", "swallowtail", "barbel", "carp", "cod", "crab", "eel", "goldfish", "haddock", "halibut", "jellyfish", "lobster", "perch", "pike", "plaice", "ray", "salmon", "sawfish", "scallop", "shark", "shell", "shrimp", "trout", "ant", "aphid", "bee", "beetle", "bumblebee", "caterpillar", "cockroach", "dragonfly", "flea", "fly", "gadfly", "grasshopper", "harvestman", "ladybug", "larva", "lousemaggot", "midge", "moth", "nymph", "wasp", "anteater", "antelope", "armadillo", "badger", "bat", "bear", "beaver", "bullock", "camel", "chimpanzee", "dachshund", "deer, hart", "dolphin", "elephant", "elk , moose", "fox", "gazelle", "gerbil", "giraffe", "goat", "guinea pig", "hamster", "hare", "hare", "hedgehog", "horse", "hyena", "lion", "llama", "lynx", "mammoth", "marmot", "mink", "mole", "mongoose", "mouse", "mule", "otter", "panda", "pig, hog", "platypus", "polecat", "pony", "porcupine", "puma", "racoon", "rat", "reindeer", "rhinoceros", "seal", "seal", "sheep", "skunk", "sloth", "squirrel", "tiger", "weasel", "whale", "wolf", "zebra", "slug", "snail", "blindworm", "boa", "chameleon", "copperhead", "cottonmouth", "crocodile", "gecko", "iguana", "lizard", "python", "salamander", "saurian", "sea snake", "sidewinder", "snake", "tortoise, turtle", "tapeworm", "leech", "earthworm", "millipede"};
    private final String[] travelList = {"Adventure", "Backpacking", "Beach", "Culture", "Destination", "Explore", "Flight", "Heritage", "Island", "Journey", "Kilometer", "Landscape", "Map", "Nomad", "Ocean", "Passport", "Quest", "Route", "Sightseeing", "Tour", "Uncharted", "Voyage", "Wander", "Xenophile", "Yacht", "Zeppelin", "Airfare", "Breathtaking", "Cruise", "Discovery", "Expedition", "Foreign", "Guidebook", "Horizon", "Itinerary", "Jetlag", "Kite", "Luggage", "Mountain", "Navigator", "Overland", "Photography", "Quaint", "Resort", "Souvenir", "Trek", "Urban", "Vacation", "Wayfarer", "Xerophyte", "Yonder", "Zipline", "Adventure", "Backpacking", "Beach", "Culture", "Destination", "Explore", "Flight", "Globe-trotting", "Heritage", "Island", "Journey", "Kilometer", "Landscape", "Map", "Nomad", "Ocean", "Passport", "Quest", "Route", "Sightseeing", "Tour", "Uncharted", "Voyage", "Wander", "Xenophile", "Yacht", "Zeppelin", "Airfare", "Breathtaking", "Cruise", "Discovery", "Expedition", "Foreign", "Guidebook", "Horizon", "Itinerary", "Jetlag", "Kite", "Luggage", "Mountain", "Navigator", "Overland", "Photography", "Quaint", "Resort", "Souvenir", "Trek"};

}
