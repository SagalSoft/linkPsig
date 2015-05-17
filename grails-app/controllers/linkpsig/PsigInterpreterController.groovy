package linkpsig

class PsigInterpreterController {

	def psigInterpreterService

    def index() { 
    	psigInterpreterService.test()
    }
}
