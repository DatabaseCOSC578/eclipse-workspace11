$(function () {
    $('[data-toggle="tooltip"]').tooltip()
})

$('input[type=file]').bootstrapFileInput();
$('.file-inputs').bootstrapFileInput();

$( function() {
    $( ".datepicker" ).datepicker({
      changeMonth: true,
      changeYear: true,
      yearRange: '1950:2013'
    });
});


function FillPermanentAddress(f) {
  if(f.fillperadd.checked == true) {
    f.permanent_street.value = f.residential_street.value;
    f.permanent_city.value = f.residential_city.value;
	f.permanent_state.value=f.residential_state.value;
	f.permanent_pin.value=f.residential_pin.value;
	f.permanent_country.value=f.residential_country.value;
  }
    if(f.fillperadd.checked == false) {
    f.permanent_address.value = '';
    f.permanent_city.value = '';
	f.permanent_state.value='';
	f.permanent_pin.value='';
	f.permanent_country.value='';
  }
}



function disable(){
     document.getElementById("name").disabled=true;
     document.getElementById("relationship").disabled=true;
     document.getElementById("position").disabled=true;
     document.getElementById("department").disabled=true;
     document.getElementById("contact").disabled=true;
     document.getElementById("name1").disabled=true;
     document.getElementById("relationship1").disabled=true;
     document.getElementById("position1").disabled=true;
     document.getElementById("department1").disabled=true;
     document.getElementById("contact1").disabled=true;
  
}
function enable(){
    document.getElementById("name").disabled=false;
    document.getElementById("relationship").disabled=false;
    document.getElementById("position").disabled=false;
    document.getElementById("department").disabled=false;
    document.getElementById("contact").disabled=false;
    document.getElementById("name1").disabled=false;
    document.getElementById("relationship1").disabled=false;
    document.getElementById("position1").disabled=false;
    document.getElementById("department1").disabled=false;
    document.getElementById("contact1").disabled=false;
 
}

	$(function() {
		var $newPractice = $('.fields').clone();
		$('#addNewExp').on('click', function(e) {
            e.preventDefault();
			$($newPractice).clone().appendTo('table.experience');
			$(".datepicker").datepicker({
				dateFormat : "yy/mm/dd"
			});
		});
	});



    function dobValidate() {


        var today = new Date();
        var nowyear = today.getFullYear();
        var nowmonth = today.getMonth();
        var nowday = today.getDate();
        var b = document.getElementById('agecheck').value;

        
        
        
        var birth = new Date(b);

        var birthyear = birth.getFullYear();
        var birthmonth = birth.getMonth();
        var birthday = birth.getDate();

        var age = nowyear - birthyear;
        var age_month = nowmonth - birthmonth;
        var age_day = nowday - birthday;


        if (age > 100) {
            alert("Age cannot be more than 100 Years. Please enter correct age")
            return false;
        }
        if (age_month < 0 || (age_month == 0 && age_day < 0)) {
            age = parseInt(age) - 1;


        }
        if ((age == 18 && age_month <= 0 && age_day <= 0) || age < 18) {
            alert("Age should be more than 18 years.Please enter a valid Date of Birth");
            return false;
        }
    }
    $(function() {
    	 var $newPractice = $('.addExpDet').clone();
    	 $('#addNewExp').on('click', function(e) {
    	          e.preventDefault();
    	  $($newPractice).clone().appendTo('#expDet');
    	  $(".datepicker").datepicker({
    	   dateFormat : "yy/mm/dd"
    	  });
    	 });
    	});
   