    public static int[] ComputeFinalPosition(int width, int height, int[] position, int[] portalA, int[] portalB, String moves) {
        boolean mooved = false;
        for (char move : moves.toCharArray()) {
            System.out.println(move);
            switch (move) {
                case 'U':
                    if (position[1] - 1 >= 0) {
                        position[1]--;
                        mooved = true;
                    }
                    break;
                case 'D':
                    if (position[1] + 1 < height) {
                        position[1]++;
                        mooved = true;
                    }
                    break;
                case 'R':
                    if (position[0] + 1 < width) {
                        position[0]++;
                        mooved = true;
                    }
                    break;
                case 'L':
                    if (position[0] - 1 >= 0) {
                        position[0]--;
                        mooved = true;
                    }
                    break;
            }
            if(mooved==true){
                if (position[0] == portalA[0] && position[1] == portalA[1]) {
                    position[0] = portalB[0];
                    position[1] = portalB[1];
                }
                else if (position[0] == portalB[0] && position[1] == portalB[1]) {
                    position[0] = portalA[0];
                    position[1] = portalA[1];
                }
                mooved=false;
            }
        }
        return position;
    }
