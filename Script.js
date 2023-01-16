// Przykład 01
function Change_City() {
    var AllS =SR.findAll();
    var i=0;
    var count = 0;
    var city = "Warszawa5";
    for (i;i<=AllS.length-1;i++) {
        //console.log(AllS[i].getId());
        var Addres = AllS[i].getAddress();
        if (Addres.getCity() == city){
            count++;
            Addres.setCity('Warszaw');
            SS.updateStudent(AllS[i]);
        }

    }
    return count;
}
Change_City();











//const tab = [];
//function A() {
//    var q = 0;
//    for (studnet of SR.findAll()) {
//        x = studnet.getGroupId();
//        w = x.getGroup();
//        c = 'WCY19KA1S0';
//        if (w == c) {
//            tab.push(studnet.getFirstName())
//            q = q+1;
//            console.log(q);
//            return q;
//        }
//        //console.log(3);
//    }
//}
//A();
//tab;
//


// c = 'WCY19KA1S0';
// if (w == c) {
//     tab.push(studnet.getFirstName())
// }
//console.log(3);
//
//


function A() {
    var AllS =SR.findAll();
    for (studnet of SR.findAll()) {
        console.log(studnet.getId());
        x = studnet.getAddress();
        x.setCity('Warszawa2');
        w = x.getCity();
        console.log(w);
        SR.save(studnet);
    }

}
A()

function Change_City() {
    var AllS =SR.findAll();
    var i=0;
    var l = 0;
    var city = "Warszawa5";
    for (i;i<=AllS.length-1;i++) {
        console.log(AllS[i].getId());
        var Addres = AllS[i].getAddress();
        if (Addres.getCity() == city){
            l++;
            Addres.setCity('Warszaw');
            SS.updateStudent(AllS[i]);
        }

    }
    return l;
}
Change_City()


{
    "id": 2,
    "firstName": "Adrian1",
    "lastName": "Rokicki1",
    "email": "adrian.rokick1i@wp.pl",
    "gender": "Female",
    "address": {
    "country": "Poland1",
        "postCode": "Warsz1aw",
        "city": "Warszaw"
},
    "groupId": {
    "id": 0
}

}
