package structures;

import game.Player;

public class File {
    public MaillonFile origin;
    MaillonFile last;

    public File(){
        this.origin = null;
        this.last = null;
    }
    public void addMaillonFile(MaillonFile mf){
        if (this.origin == null){
            this.origin = this.last = mf;
        }else{
            this.last.addNext(mf);
            this.last = mf;
        }




    }
    public void addPlayer(String name){
        addMaillonFile(new MaillonFile(new Player(name)));
    }

    public Player advance(){
        Player player = this.origin.player;
        this.addMaillonFile(this.origin);
        this.origin = this.origin.next;
        return player;
    }
}
