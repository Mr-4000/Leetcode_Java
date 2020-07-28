class Solution {
    public String simplifyPath(String path) {
        if (path.length()==0) {
            return "";
        }
        String[] map = path.split("/");
        Stack<String> folder = new Stack<String>();
        for (int i = 0;i<map.length;i++) {
            if (map[i].length()==0) {
                continue;
            }
            switch (map[i]) {
                case ".":
                    break;
                case "..":
                    if (!folder.empty()) {
                        folder.pop();
                    }
                    break;
                default:
                    folder.push(map[i]);
            }
        }
        String folderpath="";
        while (!folder.empty()) {
            folderpath = "/" + folder.pop() + folderpath;
        }
        if (folderpath=="") {
            return "/";
        }
        else {
            return folderpath;
        }
    }
}