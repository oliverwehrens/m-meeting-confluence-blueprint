Confluence.Blueprint.setWizard('com.example.plugins.tutorial.confluence.simplebp.simplebp:create-by-sample-template', function(wizard) {
	 wizard.on('submit.page1Id', function(e, state) {	
		 var vName = state.pageData.vThema;
		 if (!vName){
			 alert('Bitte Thema ausfüllen.');
			 return false;
		 }
	 });
 });