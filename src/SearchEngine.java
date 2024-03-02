public class SearchEngine {
    private static final int MAX_RESULTS = 100; // Maximum number of search results

    // Method for searching by keyword
    public Result[] search(String keyword) {
        // Perform search by keyword
        // For demonstration, returning a fixed set of results
        Result[] results = new Result[3];
        results[0] = new Result("Book 1", 2001, "Content of Book 1");
        results[1] = new Result("Book 2", 2005, "Content of Book 2");
        results[2] = new Result("Book 3", 2010, "Content of Book 3");
        return results;
    }

    // Method for searching by date range
    public Result[] search(int startYear, int endYear) {
        // Perform search by date range
        // For demonstration, returning a fixed set of results
        Result[] results = new Result[2];
        results[0] = new Result("Book 1", 2001, "Content of Book 1");
        results[1] = new Result("Book 2", 2005, "Content of Book 2");
        return results;
    }

    // Method for searching by relevance
    public Result[] search(String keyword, int startYear, int endYear) {
        // Perform search by relevance using keyword and date range
        // For demonstration, returning a fixed set of results
        Result[] results = new Result[1];
        results[0] = new Result("Book 1", 2001, "Content of Book 1");
        return results;
    }

    // Inner class representing search results
    public static class Result {
        // Properties of search results
        private String title;
        private int year;
        private String content;

        // Constructor for search result
        public Result(String title, int year, String content) {
            this.title = title;
            this.year = year;
            this.content = content;
        }

        // Getters for search result properties
        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public String getContent() {
            return content;
        }
    }
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();

        // Searching by keyword
        System.out.println("Searching by keyword:");
        SearchEngine.Result[] keywordResults = searchEngine.search("Book");
        for (SearchEngine.Result result : keywordResults) {
            System.out.println(result.getTitle() + " (" + result.getYear() + "): " + result.getContent());
        }
        System.out.println();

        // Searching by date range
        System.out.println("Searching by date range:");
        SearchEngine.Result[] dateResults = searchEngine.search(2000, 2010);
        for (SearchEngine.Result result : dateResults) {
            System.out.println(result.getTitle() + " (" + result.getYear() + "): " + result.getContent());
        }
        System.out.println();

        // Searching by relevance
        System.out.println("Searching by relevance:");
        SearchEngine.Result[] relevanceResults = searchEngine.search("Book", 2000, 2010);
        for (SearchEngine.Result result : relevanceResults) {
            System.out.println(result.getTitle() + " (" + result.getYear() + "): " + result.getContent());
        }

    }
}
