# testMongodb_Docker


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
-----------------------------------------------------

