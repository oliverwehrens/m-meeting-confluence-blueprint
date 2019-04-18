Confluence.Blueprint.setWizard('net.wehrens.confluence.meeting.meeting:create-by-decision-template', function(wizard) {
	 wizard.on('submit.page1Id', function(e, state) {	
		 var vName = state.pageData.vThema;
		 if (!vName){
			 alert('Bitte Thema ausfüllen.');
			 return false;
		 }
	 });
 });


Confluence.Blueprint.setWizard('net.wehrens.confluence.meeting.meeting:create-by-agenda-information-template', function(wizard) {
    wizard.on('submit.agenda-information-Id', function(e, state) {
        var vName = state.pageData.vThema;
        if (!vName){
            alert('Bitte Thema ausfüllen.');
            return false;
        }
    });
});