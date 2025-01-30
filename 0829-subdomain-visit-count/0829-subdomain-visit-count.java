class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> visit = new HashMap();

        for (String domain: cpdomains) {
            String[] split = domain.split(" ");
            int count = Integer.parseInt(split[0]);
            String s = split[1];
            visit.merge(s, count, Integer::sum);
            
            for(int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '.') {
                    String subDomain = s.substring(i+1);
                    visit.merge(subDomain, count, Integer::sum);
                }
            }
        }

        return visit.entrySet().stream()
                .map(entry -> entry.getValue() + " " + entry.getKey())
                .collect(Collectors.toList());
    }
}