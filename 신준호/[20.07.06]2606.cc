#include <iostream>
#include <cmath>
#include <algorithm>
#include <string>
#include <vector>

class Computer {
public:
    int id;
    std::vector<Computer> neighbors;

    Computer(int id) {
        this->id = id;
    }

};

void virusSpread(int idx, bool* isInfected, std::vector<Computer> network) {
    
    for(int i = 0; i < network.at(idx).neighbors.size(); i++) {
        int target = network.at(idx).neighbors.at(i).id;
        if(!isInfected[target]) {
            isInfected[target] = true;
            virusSpread(target, isInfected, network);
        }
    }

}

int main() {
    
    int computers, edges;
    std::cin >> computers;
    std::cin >> edges;

    std::vector<Computer> network;
    for(int i = 0; i < computers; i++)
        network.push_back(Computer(i));
        

    for(int i = 0; i < edges; i++) {
        int com1, com2;
        std::cin >> com1 >> com2;
        com1--; com2--;
        network.at(com1).neighbors.push_back(network.at(com2));
        network.at(com2).neighbors.push_back(network.at(com1));
    }

    bool* isInfected = new bool[computers];
    for(int i = 0; i < computers; i++) isInfected[i] = false;
    virusSpread(0, isInfected, network);

    int cnt = 0;
    for(int i = 1; i < computers; i++) {
        if(isInfected[i]) cnt++;
    }

    std::cout << cnt;

}


