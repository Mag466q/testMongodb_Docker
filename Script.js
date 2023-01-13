





for (studnet of SR.findAll()){
    x = studnet.getGroupId();
    x. getGroup();

}

// todo listy osobób z kazdej grupy  z adresem zamieszkania w warszawie ?

const tab = [];
function A() {
    var q = 0;
    for (studnet of SR.findAll()) {
        x = studnet.getGroupId();
        w = x.getGroup();
        c = 'WCY19KA1S0';
        if (w == c) {
            tab.push(studnet.getFirstName())
            q = q+1;
            console.log(q);
            return q;
        }
        //console.log(3);
    }
}
A();
tab;




