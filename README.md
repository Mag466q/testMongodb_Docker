# testMongodb_Docker


// Przykład 01


function Change_City() {
    var AllS =SR.findAll();
    var i=0;
    var count = 0;
    var city = "Warszawa";
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
-----------------------------------------------------

// Skrypt zmienia Warszawa na Warszaw przy kazdym studentcie który miał w miasto ustawione na Warszawa

